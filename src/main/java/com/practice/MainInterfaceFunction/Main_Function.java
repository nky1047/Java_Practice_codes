package com.practice.MainInterfaceFunction;

import com.nitin.allFunctions.*;
import java.util.Scanner;

public class Main_Function {

	public static void main(String[] args) {
		String usr = "Y";
		Scanner scanner = new Scanner(System.in);
		while (usr == "Y" || usr=="y" || usr!="0") {
			myFactorial.calcFact();
			System.out.println("Run your fuction ? (Y/n)");
			usr = scanner.next();
		}
		
		scanner.close();
		System.out.println("End of Program!");
	}
}
