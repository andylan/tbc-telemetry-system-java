package kata.ts;

import java.util.Random;

/**
 * Created by benwu on 14-6-13.
 */
public class TelemetryClientConnection {
    private final Random connectionEventsSimulator = new Random();
    protected boolean onlineStatus;

    public boolean getOnlineStatus(TelemetryClient telemetryClient)
    {
        return this.onlineStatus;
    }

    public void disconnect(TelemetryClient telemetryClient)
    {
        this.onlineStatus = false;
    }

    public void connect(String telemetryServerConnectionString)
    {
        if (telemetryServerConnectionString == null || "".equals(telemetryServerConnectionString))
        {
            throw new IllegalArgumentException();
        }

        // Fake the connection with 20% chances of success
        boolean success = this.connectionEventsSimulator.nextInt(10) <= 2;

        this.onlineStatus = success;
    }
}
