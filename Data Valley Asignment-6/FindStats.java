import java.util.Scanner;

public class FindStats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        char choice;

        do {
            System.out.println("Enter a number (or 'q' to quit): ");
            choice = scanner.next().charAt(0);

            if (choice != 'q') {
                int num = scanner.nextInt();
                largest = Math.max(largest, num);
                smallest = Math.min(smallest, num);
                sum += num;
                count++;
            }
        } while (choice != 'q');

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
