package com.assignment8;

import java.util.HashMap;
import java.util.Scanner;

public class MovieRating {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, RatingStats> ratingsByCategory = new HashMap<>();

    int numMovies;
    System.out.print("Enter the number of movies: ");
    numMovies = scanner.nextInt();

    for (int i = 0; i < numMovies; i++) {
      System.out.printf("Movie %d:\n", i + 1);
      System.out.print("  Category (e.g., PG, PG-13, R): ");
      String category = scanner.next();
      System.out.print("  Rating (out of 10): ");
      int rating = scanner.nextInt();

      // Update category statistics
      RatingStats stats = ratingsByCategory.get(category);
      if (stats == null) {
        stats = new RatingStats(category);
        ratingsByCategory.put(category, stats);
      }
      stats.addRating(rating);
    }

    System.out.println("\nMovie Rating Summary by Category:");
    for (String category : ratingsByCategory.keySet()) {
      RatingStats stats = ratingsByCategory.get(category);
      System.out.printf("  Category: %s\n", category);
      System.out.println("    Number of Movies: " + stats.numMovies);
      System.out.printf("    Average Rating: %.2f\n", stats.averageRating());
    }

    scanner.close();
  }
}

class RatingStats {
  String category;
  int numMovies;
  double totalRating;

  public RatingStats(String category) {
    this.category = category;
    this.numMovies = 0;
    this.totalRating = 0.0;
  }

  public void addRating(int rating) {
    numMovies++;
    totalRating += rating;
  }

  public double averageRating() {
    if (numMovies == 0) {
      return 0.0;
    }
    return totalRating / numMovies;
  }
}
