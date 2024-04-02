import java.util.HashMap;
import java.util.Scanner;

public class BookReviews {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    HashMap<Integer, Integer> ratingsByRange = new HashMap<>(); // 1-5, 6-10 counts
    int positive = 0, neutral = 0, negative = 0;

    int numReviews;
    System.out.print("Enter the number of book reviews: ");
    numReviews = scanner.nextInt();

    for (int i = 0; i < numReviews; i++) {
      System.out.printf("Review %d:\n", i + 1);
      System.out.print("  Rating (1-10): ");
      int rating = scanner.nextInt();
      System.out.print("  Review Sentiment (positive, neutral, negative): ");
      String sentiment = scanner.next();

      // Update rating range counts
      int rangeStart = (rating - 1) / 5 * 5 + 1;
      ratingsByRange.put(rangeStart, ratingsByRange.getOrDefault(rangeStart, 0) + 1);

      // Update sentiment counts
      switch (sentiment) {
        case "positive":
          positive++;
          break;
        case "neutral":
          neutral++;
          break;
        case "negative":
          negative++;
          break;
        default:
          System.err.println("  Invalid sentiment. Please enter positive, neutral, or negative.");
      }
    }

    System.out.println("\nBook Review Summary:");
    System.out.println("  Rating Range (Stars): Count");
    for (int start = 1; start <= 10; start += 5) {
      int end = start + 4;
      int count = ratingsByRange.getOrDefault(start, 0);
      System.out.printf("    %d-%d: %d\n", start, end, count);
    }

    System.out.println("  Sentiment Count:");
    System.out.println("    Positive: " + positive);
    System.out.println("    Neutral: " + neutral);
    System.out.println("    Negative: " + negative);

    scanner.close();
  }
}
