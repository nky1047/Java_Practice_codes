package com.nitin.allFunctions;

import java.util.Scanner;

public class sum_of_Digits_of_an_Integer {
	
	public static void calcSumofDigits() {
		int number=0;
		System.out.print("\nEnter a number to find sum of its Digits: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		int sum=0,temp=0;
		temp=number;
		System.out.print("\nCalucating the sum: ");
		while(temp>0) {
			sum+=temp%10;
			temp/=10;
			System.out.print(sum+"+ ");
		}
		System.out.println("\n\nSum of Digits of "+number+" = " +sum);
		temp=0;
		return;
		
	}	
}
