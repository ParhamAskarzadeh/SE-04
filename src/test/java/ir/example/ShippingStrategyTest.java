package ir.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingStrategyTest {
    @Test
    public void testStandardShipping() {
        ShippingStrategy shippingStrategy = new StandardShipping();
        double cost = shippingStrategy.calculateShippingCost(5.0);
        assertEquals(12.5, cost, 0.001); // مقدار مورد انتظار را تغییر دهید اگر لازم است
    }

    @Test
    public void testExpressShipping() {
        ShippingStrategy shippingStrategy = new ExpressShipping();
        double cost = shippingStrategy.calculateShippingCost(5.0);
        assertEquals(17.5, cost, 0.001); // مقدار مورد انتظار را تغییر دهید اگر لازم است
    }
}
