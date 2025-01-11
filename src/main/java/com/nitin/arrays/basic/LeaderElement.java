package com.nitin.arrays.basic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LeaderElement {
    public static void solution1(int[] arr) {

        ArraysBasicMain array = new ArraysBasicMain();
        array.printArray(arr);
        ArrayList<Integer> al = new ArrayList();
        System.out.println("\n# The Leader Elements in given arr :");
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j])
                    break;
            }
            if (j == arr.length)
                al.add(arr[i]);
        }
        System.out.println(al);
    }
}
