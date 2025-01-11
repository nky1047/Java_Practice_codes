package com.nitin.arrays.basic;

public class LinearSearch {

    public void driver(int arr[], int element_to_earch){
        int res = search(arr,element_to_earch);
        if (res==-1)
            System.out.println("\nElement "+element_to_earch +" not present!");
        else
            System.out.println("#Linear Search: \n\tElement Present at index = "+res);
    }

    static int search(int arr[], int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
}
