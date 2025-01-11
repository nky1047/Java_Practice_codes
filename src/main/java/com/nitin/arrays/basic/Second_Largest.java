package com.nitin.arrays.basic;

import java.util.Arrays;

public class Second_Largest {
    ArraysBasicMain newArray = new ArraysBasicMain();

    //    USING COLLECTION LIBRARY SORTING
    public void sorting(int arr[]) {
        int[] arr1 = newArray.deepCopy(arr);
        Arrays.sort(arr1);                  // Array sorted in ASCENDING ORDER
        System.out.print("\n Sorted array while 2nd Largest Class: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n# Second Largest using Sorting is " + arr1[arr1.length - 2]);
    }

    public int method2(int[] arr) {
        Largest_element lg = new Largest_element();
        int largest = lg.recursive(arr);    // Getting Largest Element in Array
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("# Second Largest using Method2 is " + secondLargest);
        return secondLargest;
    }
}

