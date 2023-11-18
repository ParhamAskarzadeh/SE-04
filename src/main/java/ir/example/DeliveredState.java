package ir.example;

public class DeliveredState implements PackageState {
    @Override
    public void printStatus() {
        System.out.println("Package has been delivered.");
    }
}
