package kata.ts;

/**
 * Created by benwu on 14-6-13.
 */
public class TelemetryClientConnection {
    public boolean getOnlineStatus(TelemetryClient telemetryClient)
    {
        return telemetryClient.onlineStatus;
    }

    public void disconnect(TelemetryClient telemetryClient)
    {
        telemetryClient.onlineStatus = false;
    }

    public void connect(String telemetryServerConnectionString, TelemetryClient telemetryClient)
    {
        if (telemetryServerConnectionString == null || "".equals(telemetryServerConnectionString))
        {
            throw new IllegalArgumentException();
        }

        // Fake the connection with 20% chances of success
        boolean success = telemetryClient.connectionEventsSimulator.nextInt(10) <= 2;

        telemetryClient.onlineStatus = success;
    }
}
