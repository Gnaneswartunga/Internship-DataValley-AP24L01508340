package com.datavalley;

import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the current year: ");
		int currentYear = scan.nextInt();
		System.out.print("Enter the year of joining: ");
		int joinedYear = scan.nextInt();
		int serviceYears = currentYear - joinedYear;
		int bonus = 0;
		if (serviceYears > 5) {
			bonus = 5000;
		} else if (serviceYears >= 3 && serviceYears <= 5) {
			bonus = 3000;
		}
		if (bonus > 0) {
			System.out.println("Bonus of Rs. " + bonus + "/- awarded.");
		} else {
		}
	}
}
