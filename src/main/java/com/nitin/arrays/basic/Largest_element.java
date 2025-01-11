package com.nitin.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Largest_element {

    ArraysBasicMain print = new ArraysBasicMain();

    //    ITERATIVE METHOD
    public int iterative(int arr[]) {
        int largest = 0;
        int i = 0;
        largest = arr[0];
        while (i < arr.length - 1) {
            if (arr[i + 1] > largest) largest = arr[i + 1];
            i++;
        }
        System.out.println("\n\t# Largest Element using Iterative = " + largest);
        return largest;
    }

    public int recursive(int arr[]) {
        int largest = findMax(arr, 0);
        System.out.println("\t# Largest Element using Recursive = " + largest);
        return largest;
    }

    //    RECURSIVE METHOD
    static int findMax(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        int largest = findMax(arr, i + 1);
        return Math.max(largest, arr[i]);
    }

    //    USING LIBRARY MEHTODS
    public void util(int[] arr) {
        int[] arr1 = print.deepCopy(arr);           // Without DeepCopy main array will be sorted in next line
        //arr1=arr;                                // THis is shallow copy, it will impact main array as well
        Arrays.sort(arr1);
        System.out.println("\t# Largest Element using Collections Util = " +
                arr1[arr1.length - 1]);
    }
}
