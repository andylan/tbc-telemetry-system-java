package kata.ts;

/**
 * Created by benwu on 14-6-13.
 */
public class TestingTelemetryClientConnection extends TelemetryClientConnection {
    @Override
    public void connect(String telemetryServerConnectionString)
    {
        super.onlineStatus = true;
    }
}
