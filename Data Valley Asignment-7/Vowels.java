package com.datavalley;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		int vowelcount = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = Character.toLowerCase(input.charAt(i));
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowelcount++;
			}
		}
		if (vowelcount > 0) {
			System.out.println("string contains " + vowelcount + " vowels.");
		} else {
			System.out.println("string does not any vowels.");
		}
		scan.close();
	}
}
