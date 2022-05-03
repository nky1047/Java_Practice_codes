package com.nitin.algoPractice.collection;

import java.util.ArrayList;
import java.util.List;

public class gradingStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		
		//ArrayList<Integer> up_grades = new ArrayList<Integer>();
		int [] up_grades = null;
		
		for(int i=0; i<grades.size(); i++) {
			if(grades.get(i)<38)
				{//up_grades.add(i, grades.get(i));
					up_grades[i]=grades.get(i);
				}
			else if(	grades.get(i)>=38 	&&		(nextMultipleOf5(grades.get(i))-grades.get(i))<3)
				{//up_grades.add(i, nextMultipleOf5(grades.get(i)));
					up_grades[i]=nextMultipleOf5(grades.get(i));
				}
			else
				//up_grades.add(i, grades.get(i));	
				up_grades[i]=grades.get(i);
		}
		
	}

	static int nextMultipleOf5(int n) {
		int 	x= (((n/5)+1)*5);
		return x;
	}
}










/*
 * HackerLand University has the following grading policy:
 * 
 * Every student receives a in the inclusive range from to . Any less than is a
 * failing grade. Sam is a professor at the university and likes to round each
 * student's according to these rules:
 * 
 * If the difference between the and the next multiple of is less than , round
 * up to the next multiple of . If the value of is less than , no rounding
 * occurs as the result will still be a failing grade. Examples
 * 
 * round to (85 - 84 is less than 3) do not round (result is less than 40) do
 * not round (60 - 57 is 3 or higher) Given the initial value of for each of
 * Sam's students, write code to automate the rounding process.
 * 
 * Function Description
 * 
 * Complete the function gradingStudents in the editor below.
 * 
 * gradingStudents has the following parameter(s):
 * 
 * int grades[n]: the grades before rounding Returns
 * 
 * int[n]: the grades after rounding as appropriate Input Format
 * 
 * The first line contains a single integer, , the number of students. Each line
 * of the subsequent lines contains a single integer, .
 * 
 * Constraints
 * 
 * Sample Input 
 * 0
 * 4 
 * 73 
 * 67 
 * 38 
 * 33
 *  
 * Sample Output 
 * 0
 * 75 
 * 67 
 * 40 
 * 33
 */