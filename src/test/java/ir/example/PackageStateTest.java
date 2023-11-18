package ir.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PackageStateTest {
    @Test
    public void testInTransitState() {
        PackageState state = new InTransitState();
        assertTrue(state instanceof InTransitState);
    }

    @Test
    public void testDeliveredState() {
        PackageState state = new DeliveredState();
        assertTrue(state instanceof DeliveredState);
    }
}
