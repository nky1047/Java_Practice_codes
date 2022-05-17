package com.nitin.allFunctions;

import java.util.Scanner;

public class myFactorial {

	public static void calcFact() {
		int number;
		System.out.print("\nEnter an Integer to calculate its Factorial: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		int factorial = fact(number);
		System.out.println(" \nFactorial of " + number + " is :" + factorial);
	}

	static int fact(int number) {
		int factorial = 1;
		while (number > 0) {
			factorial = factorial * number;
			number--;
			System.out.print(factorial + "x" + number + "=");

		}
		return factorial;
	}
}
