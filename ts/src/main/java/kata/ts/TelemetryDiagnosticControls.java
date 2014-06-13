package kata.ts;

/**
 * Created by benwu on 14-6-10.
 */
public class TelemetryDiagnosticControls {
    private final static String DIAGNOSTIC_CHANNEL_CONNECTION_STRING = "*111#";

    private final TelemetryClient telemetryClient;
    private final TelemetryClientConnection telemetryClientConnection;
    private String diagnosticInfo = "";

    public TelemetryDiagnosticControls()
    {
        this(new TelemetryClient(), new TelemetryClientConnection());
    }

    public TelemetryDiagnosticControls(TelemetryClient telemetryClient) {
        this(telemetryClient, new TelemetryClientConnection());
    }

    public TelemetryDiagnosticControls(TelemetryClient telemetryClient, TelemetryClientConnection telemetryClientConnection) {
        this.telemetryClient = telemetryClient;
        this.telemetryClientConnection = telemetryClientConnection;
    }

    public String getDiagnosticInfo()
    {
        return diagnosticInfo;
    }

    public void setDiagnosticInfo(String diagnosticInfo)
    {
        this.diagnosticInfo = diagnosticInfo;
    }

    public void checkTransmission() throws Exception
    {
        diagnosticInfo = "";

        telemetryClient.telemetryClientConnection.disconnect(telemetryClient);

        int retryLeft = 3;
        while (telemetryClient.telemetryClientConnection.getOnlineStatus(telemetryClient) == false && retryLeft > 0)
        {
            telemetryClient.telemetryClientConnection.connect(DIAGNOSTIC_CHANNEL_CONNECTION_STRING);
            retryLeft -= 1;
        }

        if(telemetryClient.telemetryClientConnection.getOnlineStatus(telemetryClient) == false)
        {
            throw new Exception("Unable to connect.");
        }

        telemetryClient.telemetryDataChannel.send(TelemetryClient.DIAGNOSTIC_MESSAGE, telemetryClient);
        diagnosticInfo = telemetryClient.telemetryDataChannel.receive(telemetryClient);
    }
}
