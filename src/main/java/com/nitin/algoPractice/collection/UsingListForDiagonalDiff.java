package com.nitin.algoPractice.collection;

import java.util.ArrayList;
import java.util.List;

public class UsingListForDiagonalDiff {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

		arr.add(new ArrayList<Integer>());
		
		arr.get(0).add(0,3);			arr.get(0).add(1,6);			arr.get(0).add(2,5);

		
		arr.add(new ArrayList<Integer>());
		
		arr.get(1).add(0,2);			arr.get(1).add(1,3);			arr.get(1).add(2,9);
		
		arr.add(new ArrayList<Integer>());
		arr.get(2).add(0,7);			arr.get(2).add(1,4);			arr.get(2).add(2,6);
		
		
		System.out.println(arr);
		
		/*
		 * int d1 = 0, d2 = 0; for (int i = 0, j = 0; i < arr.size(); i++) { if (i == j)
		 * d1 += arr.get(i).get(j); if ((i + j) == arr.size()) d2 += arr.get(i).get(j);
		 * } int result = Math.abs(d1 - d2); System.out.println(result);
		 */
	}
}
