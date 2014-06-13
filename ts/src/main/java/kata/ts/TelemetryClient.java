package kata.ts;

import java.util.Random;

/**
 * Created by benwu on 14-6-10.
 */
public class TelemetryClient {
    //
    // The communication with the server is simulated in this implementation.
    // Because the focus of the exercise is on the other class.
    //

    public static final String DIAGNOSTIC_MESSAGE = "AT#UD";
    public static final String DIAGNOSTIC_INFO = "LAST TX rate................ 100 MBPS\r\n"
            + "HIGHEST TX rate............. 100 MBPS\r\n"
            + "LAST RX rate................ 100 MBPS\r\n"
            + "HIGHEST RX rate............. 100 MBPS\r\n"
            + "BIT RATE.................... 100000000\r\n"
            + "WORD LEN.................... 16\r\n"
            + "WORD/FRAME.................. 511\r\n"
            + "BITS/FRAME.................. 8192\r\n"
            + "MODULATION TYPE............. PCM/FM\r\n"
            + "TX Digital Los.............. 0.75\r\n"
            + "RX Digital Los.............. 0.10\r\n"
            + "BEP Test.................... -5\r\n"
            + "Local Rtrn Count............ 00\r\n"
            + "Remote Rtrn Count........... 00";
    TelemetryDataChannel telemetryDataChannel;
    TelemetryClientConnection telemetryClientConnection;

    private boolean diagnosticMessageJustSent = false;

    private final Random randomMessageSimulator = new Random();

    public TelemetryClient() {
        this.telemetryClientConnection = new TelemetryClientConnection();
        this.telemetryDataChannel = new TelemetryDataChannel();
    }

    public String receive()
    {
        String message;

        if (diagnosticMessageJustSent)
        {
            // Simulate the reception of the diagnostic message
            message = DIAGNOSTIC_INFO;

            diagnosticMessageJustSent = false;
        }
        else
        {
            // Simulate the reception of a response message returning a random message.
            message = "";
            int messageLength = randomMessageSimulator.nextInt(50) + 60;
            for(int i = messageLength; i > 0; --i)
            {
                message += (char)randomMessageSimulator.nextInt(40) + 86;
            }
        }

        return message;
    }
}
