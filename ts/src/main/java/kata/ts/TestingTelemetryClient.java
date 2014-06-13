package kata.ts;

/**
 * Created by benwu on 14-6-13.
 */
public class TestingTelemetryClient extends TelemetryClient {
    @Override
    public void connect(String telemetryServerConnectionString)
    {
        super.onlineStatus = true;
    }
}
