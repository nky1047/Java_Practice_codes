package com.nitin.arrays.basic;

import java.util.ArrayList;

public class ArraysBasicMain {


    //    public static int arr_eg[] = {10, 834,324, 45, 90, 9808};
    public static final int arr_eg[] = {16, 17, 4, 3, 5, 2};

    // METHOD TO PRINT AN ARRAY
    public static void printArray(int[] arr) {
        System.out.print("\nCurrently the Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //     METHOD TO SHALLOW COPY AN ARRAY TO TARGET ARRAY
    public int[] shallowCopy(int[] mainArray) {
        int[] newArray = mainArray;
        return newArray;
    }

    //     METHOD TO DEEP COPY AN ARRAY TO TARGET ARRAY
    public int[] deepCopy(int[] mainArray) {
        int[] newArray = new int[mainArray.length];

        for (int i = 0; i < mainArray.length; i++) {
            newArray[i] = mainArray[i];
        }
        return newArray;
    }

    public static void main(String[] args) {

        printArray(arr_eg);

        PrintAlternates eg1 = new PrintAlternates();
        LinearSearch eg2 = new LinearSearch();
        Largest_element largest = new Largest_element();
        Second_Largest eg4 = new Second_Largest();
        LargestThree eg5 = new LargestThree();
        LeaderElement eg6 = new LeaderElement();

//      Method for Printing the Alternate Values in an Array
        eg1.iterative(arr_eg);       //Iterative Approach
        eg1.recursive(arr_eg);      //Recursive APProach

//      METHOD FOR LINEAR SEARCH                   //  To be used when Data Set is small
        eg2.driver(arr_eg, 34);     // This is an Iterative Approach

//      Largest Element in an Array
        largest.iterative(arr_eg);     //Iterative
        largest.recursive(arr_eg);     //Recursive
        largest.util(arr_eg);

//      Second_Largest in the Array
        eg4.sorting(arr_eg);
        eg4.method2(arr_eg);

//      GET LARGEST THREE ELEMENTS
        eg5.method1(arr_eg);        // IN ONE TRAVESAL
        eg5.method2(arr_eg);        // BY SORTING

//        GET LEADER ELEMENT WHICH IS >= All ELEMENTs ON RIGHT of Element in array
        eg6.solution1(arr_eg);

    }


}
