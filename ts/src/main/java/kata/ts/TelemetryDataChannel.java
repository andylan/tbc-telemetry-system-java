package kata.ts;

/**
 * Created by benwu on 14-6-13.
 */
public class TelemetryDataChannel {
    private boolean diagnosticMessageJustSent = false;

    // TODO-working-on: Combining the two connection management methods with the two data communication methods violates the Single Responsibility Principle
    public void send(String message, TelemetryClient telemetryClient)
    {
        if (message == null || "".equals(message))
        {
            throw new IllegalArgumentException();
        }

        // The simulation of Send() actually just remember if the last message sent was a diagnostic message.
        // This information will be used to simulate the Receive(). Indeed there is no real server listening.
        if (message == TelemetryClient.DIAGNOSTIC_MESSAGE)
        {
            this.diagnosticMessageJustSent = true;
        }
        else
        {
            this.diagnosticMessageJustSent = false;
        }
    }

    public String receive(TelemetryClient telemetryClient)
    {
        String message;

        if (this.diagnosticMessageJustSent)
        {
            // Simulate the reception of the diagnostic message
            message = TelemetryClient.DIAGNOSTIC_INFO;

            this.diagnosticMessageJustSent = false;
        }
        else
        {
            // Simulate the reception of a response message returning a random message.
            message = "";
            int messageLength = telemetryClient.randomMessageSimulator.nextInt(50) + 60;
            for(int i = messageLength; i > 0; --i)
            {
                message += (char) telemetryClient.randomMessageSimulator.nextInt(40) + 86;
            }
        }

        return message;
    }
}
