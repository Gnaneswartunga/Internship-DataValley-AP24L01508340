import java.util.Scanner;

public class DiscountedExpenses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity purchased: ");
        int quantity = scanner.nextInt();
        System.out.println("Enter price per item: ");
        double price = scanner.nextDouble();

        double total = quantity * price;
        double discount = 0;

        if (quantity > 50) {
            discount = 0.1;
        } else if (quantity >= 25) {
            discount = 0.05;
        }

        double finalPrice = total - (total * discount);
        System.out.println("Total expenses after discount: $" + finalPrice);

        scanner.close();
    }
}
