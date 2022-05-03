package com.nitin.algoPractice.collection;

public class Staircase {

	public static void main(String[] args) {
		int n = 11;;
	
		for (int k = 1; k<=n; k++) {
			for (int j = k; j < n; j++) {
				System.out.print(" ");
			}
			for (int j=n-k; j< n; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}

}
