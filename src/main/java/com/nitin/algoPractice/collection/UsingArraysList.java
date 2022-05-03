package com.nitin.algoPractice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
		    
		    x.add(new ArrayList<Integer>());
		    System.out.println(x);
		    x.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));System.out.println(x);
		    x.get(0).add(0, 3);System.out.println(x);
		    x.get(1).add(0, 366);System.out.println(x);
			x.get(1).add(4, 576);System.out.println(x);
			x.add(2, new ArrayList<>(Arrays.asList(3, 84)));System.out.println(x);
		    x.add(new ArrayList<Integer>(Arrays.asList(83, 6684, 776)));System.out.println(x);
		    x.add(new ArrayList<>(Arrays.asList(8)));System.out.println(x);
		    x.get(4).addAll(Arrays.asList(9, 10, 11));System.out.println(x);
		    x.get(1).addAll(3, Arrays.asList(22, 1000));System.out.println(x);
		    System.out.println(x.size());
		}
}
		    /*int leftdiagonal = 0, rightdiagonal = 0;
		for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
		        leftdiagonal = leftdiagonal + arr.get(i).get(i);
		        rightdiagonal = rightdiagonal + arr.get(i).get(j);
		        }
		        return Math.abs(leftdiagonal - rightdiagonal);
		        }*/
