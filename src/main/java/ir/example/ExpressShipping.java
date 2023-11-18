package ir.example;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 3.5;
    }
}

