package com.practice.BasicJava;

import java.util.Scanner;

public class Factorial_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myFactorial();
	
		String usr ="Y"; 
		while(usr!="N" || usr!="n") { 
			Scanner scanner = new Scanner(System.in); 
			usr=scanner.next();
			myFactorial();
		 
		}
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

	static void myFactorial() {
		int number = 5;
		System.out.print("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		int factorial = fact(number);
		System.out.println(" \nFactorial of " + number + " is :" + factorial);
	}

}
