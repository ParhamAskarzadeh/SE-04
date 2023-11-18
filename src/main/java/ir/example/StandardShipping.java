package ir.example;

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 2.5;
    }
}