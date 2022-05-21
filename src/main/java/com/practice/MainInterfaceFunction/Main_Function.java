package com.practice.MainInterfaceFunction;

import com.nitin.allFunctions.*;
import java.util.Scanner;

public class Main_Function {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Factorial
		// myFactorial.calcFact();

		// SumofDigits

		// Reverse a Number
		// reverseTheNumber.rev();

		// Strong Number
		// Strong_number.calStrong();
		

		Scanner input = new Scanner(System.in);
		char consent ='y';
		while (consent == 'y' ){
			sum_of_Digits_of_an_Integer.calcSumofDigits();
			System.out.print("Wanna Continue(y/n)?");
			
			consent = input.next().charAt(0);
			
		} 
		scanner.close();
		System.out.println("END OF PROGRAM!!");
	}
}
