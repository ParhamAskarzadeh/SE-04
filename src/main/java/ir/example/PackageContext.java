package ir.example;
import java.util.Scanner;

public class PackageContext {
    private PackageState currentState;

    public PackageContext() {
        currentState = new InTransitState();
    }

    public PackageState getCurrentState() {
        return currentState;
    }

    public void setState(PackageState state) {
        currentState = state;
    }

    public void printStatus() {
        currentState.printStatus();
    }
}