package com.assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestScoreStatistics {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();

    int numStudents;
    System.out.print("Enter the number of students: ");
    numStudents = scanner.nextInt();

    System.out.println("Enter test scores for each student:");
    for (int i = 0; i < numStudents; i++) {
      scores.add(scanner.nextInt());
    }

    // Calculate statistics
    Collections.sort(scores); // Sort scores for median calculation
    int totalScore = 0;
    for (int score : scores) {
      totalScore += score;
    }
    double average = (double) totalScore / scores.size();

    int aboveAverage = 0, atAverage = 0, belowAverage = 0;
    int medianIndex = scores.size() / 2;
    int medianScore = scores.get(medianIndex);
    for (int score : scores) {
      if (score > average) {
        aboveAverage++;
      } else if (score == average) {
        atAverage++;
      } else {
        belowAverage++;
      }
    }

    System.out.println("\nTest Score Statistics:");
    System.out.println("  Above Average: " + aboveAverage);
    System.out.println("  At Average: " + atAverage);
    System.out.println("  Below Average: " + belowAverage);
    System.out.println("  Median Score: " + medianScore);

    scanner.close();
  }
}
