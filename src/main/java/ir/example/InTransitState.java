package ir.example;

public class InTransitState implements PackageState {
    @Override
    public void printStatus() {
        System.out.println("Package is in transit.");
    }
}