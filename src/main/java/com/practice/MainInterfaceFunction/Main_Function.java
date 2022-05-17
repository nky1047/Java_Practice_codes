package com.practice.MainInterfaceFunction;

import com.nitin.allFunctions.*;
import java.util.Scanner;

public class Main_Function {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		//Factorial
		myFactorial.calcFact();
		
		//SumofDigits
		sum_of_Digits_of_an_Integer.calcSumofDigits();
		
		//Reverse a Number
		reverseTheNumber.rev();

		/*
		 * System.out.println("Run your fuction ? (Y/n)");
		 * String usr = "Y";
		 * 
		 * while (usr == "Y" || usr=="y" ||
		 * usr!="0") { 
		 * usr = scanner.next(); 
		 * } 
		 *
		 */
		scanner.close();
		System.out.println("\nEND  OF  PROGRAM!");
	}
}
