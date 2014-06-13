package kata.ts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-6-10.
 */
public class TelemetryDiagnosticControlsTest {

    // TODO-acceptance-test: retry to connect to the server for maximum 3 times
    // TODO-acceptance-test: throw an exception if it cannot connect to the server for more than 3 times

    // TODO-acceptance-test-working-on: it can use a telemetry client to send a diagnostic message and receive a diagnostic info
    @Test
    public void it_can_use_a_telemetry_client_to_send_a_diagnostic_message_and_receive_a_diagnostic_info() throws Exception{
        // Arrange
        TelemetryDiagnosticControls telemetryDiagnosticControls = new TelemetryDiagnosticControls();

        // Act
        telemetryDiagnosticControls.checkTransmission();

        // Assert
        assertEquals(TelemetryClient.DIAGNOSTIC_INFO, telemetryDiagnosticControls.getDiagnosticInfo());
    }

    // TODO-new-feature: Retry to connect to the server for maximum 5 times
}
