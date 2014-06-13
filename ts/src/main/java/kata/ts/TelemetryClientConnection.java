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
}
