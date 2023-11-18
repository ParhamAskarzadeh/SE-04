package ir.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PackageContextTest {
    @Test
    public void testInitialState() {
        PackageContext packageContext = new PackageContext();
        assertTrue(packageContext.getCurrentState() instanceof InTransitState);
    }

    @Test
    public void testSetState() {
        PackageContext packageContext = new PackageContext();
        PackageState newState = new DeliveredState();
        packageContext.setState(newState);
        assertTrue(packageContext.getCurrentState() instanceof DeliveredState);
    }
}
