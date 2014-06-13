package kata.ts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-6-10.
 */
public class TelemetryDiagnosticControlsTest {
    @Test
    public void it_can_use_a_telemetry_client_to_send_a_diagnostic_message_and_receive_a_diagnostic_info() throws Exception{
        // Arrange
        TestingTelemetryClient testingTelemetryClient = new TestingTelemetryClient();
        TelemetryDiagnosticControls telemetryDiagnosticControls = new TelemetryDiagnosticControls(testingTelemetryClient);

        // Act
        telemetryDiagnosticControls.checkTransmission();

        // Assert
        assertEquals(TelemetryClient.DIAGNOSTIC_INFO, telemetryDiagnosticControls.getDiagnosticInfo());
    }
}
