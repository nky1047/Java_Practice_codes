package com.nitin.allFunctions;

import java.util.Scanner;

public class reverseTheNumber {
	
	public static void rev() {
		int number=0;
		System.out.print("\nEnter a number to find its reverse: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		int r=0,temp=0;
		temp=number;
		while(temp>0) {
			r= r*10+temp%10;
			temp/=10;
		}
		System.out.println("\nThe Reverse of "+number+" ="+r);
	}
}
