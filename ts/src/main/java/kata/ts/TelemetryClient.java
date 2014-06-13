package kata.ts;

import java.util.Random;

/**
 * Created by benwu on 14-6-10.
 */
public class TelemetryClient {
    TelemetryDataChannel telemetryDataChannel;
    TelemetryClientConnection telemetryClientConnection;

    public TelemetryClient() {
        this.telemetryClientConnection = new TelemetryClientConnection();
        this.telemetryDataChannel = new TelemetryDataChannel();
    }

}
