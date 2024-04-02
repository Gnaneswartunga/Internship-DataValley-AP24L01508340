package com.assignment8;

import java.util.ArrayList;
import java.util.Scanner;

class Project {
  String name;
  int duration; // Estimated duration in days
  int actualTime; // Actual time taken in days

  public Project(String name, int duration, int actualTime) {
    this.name = name;
    this.duration = duration;
    this.actualTime = actualTime;
  }

  public String getStatus() {
    if (actualTime < duration) {
      return "Early";
    } else if (actualTime > duration) {
      return "Late";
    } else {
      return "On Time";
    }
  }
}

public class ProjectCompletion {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Project> projects = new ArrayList<>();

    int numProjects;
    System.out.print("Enter the number of projects: ");
    numProjects = scanner.nextInt();

    for (int i = 0; i < numProjects; i++) {
      System.out.printf("Project %d:\n", i + 1);
      System.out.print("  Name: ");
      String name = scanner.next();
      System.out.print("  Estimated Duration (days): ");
      int duration = scanner.nextInt();
      System.out.print("  Actual Time Taken (days): ");
      int actualTime = scanner.nextInt();
      projects.add(new Project(name, duration, actualTime));
    }

    int onTime = 0, late = 0, early = 0;
    double totalTime = 0;

    for (Project project : projects) {
      totalTime += project.actualTime;
      switch (project.getStatus()) {
        case "On Time":
          onTime++;
          break;
        case "Late":
          late++;
          break;
        case "Early":
          early++;
          break;
      }
    }

    double averageTime = totalTime / projects.size();

    System.out.println("\nProject Completion Summary:");
    System.out.println("  On Time: " + onTime);
    System.out.println("  Late: " + late);
    System.out.println("  Early: " + early);
    System.out.printf("  Average Time Taken: %.2f days\n", averageTime);

    scanner.close();
  }
}

