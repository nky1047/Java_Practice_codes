package com.nitin.algoPractice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class miniMaxSum {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();

		arr.add(1);
		arr.add(3);
		arr.add(5);
		arr.add(7);
		arr.add(9);
		System.out.println("Arraylist =" + arr);

		// Write your code here
		/*
		 * int min_sum = 0, max_sum = 0,sum=0; for (int i = 0; i < arr.size() - 1; i++)
		 * { sum += arr.get(i); if (sum > min_sum) min_sum = sum; if (sum < max_sum)
		 * max_sum = sum; }
		 */
				
		Collections.sort(arr);
		
		long min = 0, max = 0;
		for(int i = 0, j = arr.size() - 1; i < arr.size() - 1; i++, j--){
		            max = max + arr.get(j);
		            min = min + arr.get(i);
		        }

		System.out.println(min + " " + max);
	}

}