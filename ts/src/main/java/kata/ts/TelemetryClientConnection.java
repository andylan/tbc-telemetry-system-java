package kata.ts;

import java.util.Random;

/**
 * Created by benwu on 14-6-13.
 */
public class TelemetryClientConnection {
    //
    // The communication with the server is simulated in this implementation.
    // Because the focus of the exercise is on the other class.
    //

    private final Random connectionEventsSimulator = new Random();
    protected boolean onlineStatus;

    public boolean getOnlineStatus()
    {
        return this.onlineStatus;
    }

    public void disconnect()
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
