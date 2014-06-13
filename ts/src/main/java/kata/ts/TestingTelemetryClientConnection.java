package kata.ts;

/**
 * Created by benwu on 14-6-13.
 */
public class TestingTelemetryClientConnection extends TelemetryClient {
    @Override
    public void connect(String telemetryServerConnectionString)
    {
        super.onlineStatus = true;
    }
}
