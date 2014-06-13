package kata.ts;

/**
 * Created by benwu on 14-6-13.
 */
public class TelemetryDataChannel {
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
            telemetryClient.diagnosticMessageJustSent = true;
        }
        else
        {
            telemetryClient.diagnosticMessageJustSent = false;
        }
    }
}
