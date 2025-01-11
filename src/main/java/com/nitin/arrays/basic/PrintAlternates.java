package com.nitin.arrays.basic;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;

public class PrintAlternates {
    public void iterative(int a[]) {
        System.out.print("\nAlternate Elements using iteration: ");
        for (int i = 0; i < a.length; i += 2) {
            if(i==a.length)
                break;
            System.out.print(a[i] + " ");
        }
    }

    //      USING RECURSIVE METHOD
    public void recursive(int a[]) {
        ArrayList<Integer> res = new ArrayList<>();
        getAlternates(a, 0, res);
        System.out.println("\nAlternate Elements using Rec: " + res);
    }

    //    Recursive Method to Store Alternate Elements for METHOD-2
    static void getAlternates(int[] arr, int index, ArrayList<Integer> res) {
        if (index < arr.length) {
            res.add(arr[index]);
            getAlternates(arr, index + 2, res);
        }
    }
}
