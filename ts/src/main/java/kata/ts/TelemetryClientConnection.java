package kata.ts;

/**
 * Created by benwu on 14-6-13.
 */
public class TelemetryClientConnection {
    protected boolean onlineStatus;

    public boolean getOnlineStatus(TelemetryClient telemetryClient)
    {
        return this.onlineStatus;
    }

    public void disconnect(TelemetryClient telemetryClient)
    {
        this.onlineStatus = false;
    }

    public void connect(String telemetryServerConnectionString, TelemetryClient telemetryClient)
    {
        if (telemetryServerConnectionString == null || "".equals(telemetryServerConnectionString))
        {
            throw new IllegalArgumentException();
        }

        // Fake the connection with 20% chances of success
        boolean success = telemetryClient.connectionEventsSimulator.nextInt(10) <= 2;

        this.onlineStatus = success;
    }
}
