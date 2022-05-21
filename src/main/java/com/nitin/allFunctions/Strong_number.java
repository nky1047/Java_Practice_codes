package com.nitin.allFunctions;

import java.util.Scanner;

public class Strong_number {
	public static void calStrong() {
		int number=0;
		System.out.print("\nEnter a number to check if its a Strong number: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		int strong=0,temp=number;
		while(temp>0) {
			strong += temp%10;
			temp/=10;
		}
		if(temp==number) System.out.println("\nStrong number!");
		else System.out.println("\n\t"+number+" is not a Strong number!");
		
	}
}
