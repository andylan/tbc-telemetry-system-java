package kata.ts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-6-10.
 */
public class TelemetryDiagnosticControlsTest {
    @Test
    public void a_trivial_test(){
        assertEquals(5, 2 + 3);
    }

    // TODO-acceptance-test: retry to connect to the server for maximum 3 times
    // TODO-acceptance-test: throw an exception if it cannot connect to the server for more than 3 times
    // TODO-acceptance-test: it can use a telemetry client to send a diagnostic message and receive a diagnostic info

    // TODO-new-feature: Retry to connect to the server for maximum 5 times
}
