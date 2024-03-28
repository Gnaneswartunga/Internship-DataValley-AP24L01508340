package com.datavalley;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of days late: ");
		int NoOfDaysLate = scan.nextInt();
		double FineAmount = 0;
		if (NoOfDaysLate > 0 && NoOfDaysLate <= 7) {
			FineAmount = 0.50;
		} 
		else if (NoOfDaysLate > 7 && NoOfDaysLate <= 14) {
			FineAmount = 1;
		} 
		else if (NoOfDaysLate > 14 && NoOfDaysLate <= 21) {
			FineAmount = 5;
		} 
		else if (NoOfDaysLate > 21) {
			FineAmount = 5;
			System.out.println("Your membership has been canceled.");
		}
		System.out.println("The fine is Rs. " + FineAmount + "/-.");
		scan.close();
	}
}
