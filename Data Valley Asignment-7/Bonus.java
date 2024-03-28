package com.datavalley;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No.Of.Years Organization Service: ");
		int years = scan.nextInt();
		if(years>5) {
			System.out.println("Bonus added 5000");
		}else if(years>=3 || years>=5) {
			System.out.println("Bonus added 3000");
		}else {
			System.out.println("No Bonus");
		}
		scan.close();
	}
}
