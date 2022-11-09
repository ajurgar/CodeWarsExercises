import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GrassHopperTest {
    @Test
    public void basicTests() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", GrassHopper.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", GrassHopper.greet("Greg", "Daniel"));
    }
}