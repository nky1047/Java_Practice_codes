package com.nitin.allFunctions;

import java.util.Scanner;

public class myFactorial {

	public static void calcFact() {
		int number = 5;
		System.out.print("Enter a number: ");
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
