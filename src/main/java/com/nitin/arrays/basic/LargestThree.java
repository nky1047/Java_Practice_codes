package com.nitin.arrays.basic;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestThree {

    ArraysBasicMain mainArray = new ArraysBasicMain();
    // Solution to Get Result in ONE Traversal
    public List<Integer> method1 (int arr[]){
        int arr2[]= mainArray.deepCopy(arr);
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=0; i<arr2.length; i++){
            if(arr2[i]>first){
                third=second;
                second=first;
                first=arr2[i];
            } else if (arr2[i]>second && arr2[i]!=first) {
                third=second;
                second=arr2[i];
            } else if (arr2[i]> third && arr2[i]!=second && arr2[i]!=first) {
                third=arr2[i];
            }
        }
        mainArray.printArray(arr);

        List<Integer> res = new ArrayList<>();

        if(first==Integer.MIN_VALUE) {
            return res;
        }
        res.add(first);
        if(second == Integer.MIN_VALUE) {
            return res;
        }
        res.add(second);
        if( third == Integer.MIN_VALUE) {
            return res;
        }
        res.add(third);
        System.out.println("\n# The 3 Largest Elements are at index: "+ res);
        return res;
    }

    public void method2 (int arr[]){
        int[] arr1  = mainArray.deepCopy(arr);
        Arrays.sort(arr1);
        int first = arr1[arr1.length-1];
        int second = arr1[arr1.length-2];
        int third = arr1[arr1.length-3];
        System.out.println("# The 3 largest elements are "+first+" "+second+" "+third);
    }
}
