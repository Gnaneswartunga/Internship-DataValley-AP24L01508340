package com.assignment8;

import java.util.HashMap;
import java.util.Scanner;

public class RestaurantRatings {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    HashMap<Integer, RatingStats> ratingsByRange = new HashMap<>(); // 1-5, 6-10 counts

    int numRestaurants;
    System.out.print("Enter the number of restaurants: ");
    numRestaurants = scanner.nextInt();

    for (int i = 0; i < numRestaurants; i++) {
      System.out.printf("Restaurant %d:\n", i + 1);
      System.out.print("  Rating (1-10): ");
      int rating = scanner.nextInt();

      // Validate rating input (1-10)
      if (rating < 1 || rating > 10) {
        System.err.println("  Invalid rating. Please enter a number between 1 and 10.");
        i--; // Decrement counter to repeat for invalid input
        continue;
      }

      // Update rating range counts
      int rangeStart = (rating - 1) / 5 * 5 + 1;
      RatingStats stats = ratingsByRange.get(rangeStart);
      if (stats == null) {
        stats = new RatingStats(rangeStart);
        ratingsByRange.put(rangeStart, stats);
      }
      stats.addRating(rating);
    }

    System.out.println("\nRestaurant Rating Summary:");
    System.out.println("  Rating Range (Stars): Count  Average Rating");
    for (int start = 1; start <= 10; start += 5) {
      int end = start + 4;
      RatingStats stats = ratingsByRange.get(start);
      if (stats != null) {
        System.out.printf("    %d-%d:        %d        %.2f\n", start, end, stats.numRatings, stats.averageRating());
      } else {
        System.out.printf("    %d-%d:        %d        -\n", start, end, 0);
      }
    }

    scanner.close();
  }
}

class RatingStats {
  int rangeStart;
  int numRatings;
  double totalRating;

  public RatingStats(int rangeStart) {
    this.rangeStart = rangeStart;
    this.numRatings = 0;
    this.totalRating = 0.0;
  }

  public void addRating(int rating) {
    numRatings++;
    totalRating += rating;
  }

  public double averageRating() {
    if (numRatings == 0) {
      return 0.0;
    }
    return totalRating / numRatings;
  }
}
