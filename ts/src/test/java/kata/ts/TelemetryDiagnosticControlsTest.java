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

    // TODO-new-feature: Retry to connect to the server for maximum 5 times
}
