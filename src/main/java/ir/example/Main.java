package ir.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShippingStrategy shippingStrategy = new StandardShipping();
        PackageContext packageContext = new PackageContext();

        while (!(packageContext.getCurrentState() instanceof DeliveredState)) {
            System.out.print("Choose shipping method (1 for Standard, 2 for Express): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                shippingStrategy = new StandardShipping();
            } else if (choice == 2) {
                shippingStrategy = new ExpressShipping();
            } else {
                System.out.println("Invalid choice. Please choose again.");
                continue;
            }

            double shippingCost = shippingStrategy.calculateShippingCost(5.0);
            System.out.println("Shipping cost: $" + shippingCost);

            packageContext.setState(new InTransitState());
            packageContext.printStatus();

            System.out.print("Has the package been delivered? (1 for Yes, 0 for No): ");
            int delivered = scanner.nextInt();
            if (delivered == 1) {
                packageContext.setState(new DeliveredState());
                packageContext.printStatus();
            }
        }

        scanner.close();
    }
}
