package com.nitin.algoPractice.collection;
import java.util.HashMap;
public class TwoSum_leetcode

    /*
    * 1. Iterate over every number in the array
    * 2. Calculate the complement that would sum to our target
    * 3. Check if that complement is in our hash table
    * 4. Add the current number to our hash table
    * */

{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int [] a= {5,2,3};
        int target = 8;
        int [] solArr =(sol.twoSum(a,target));

        for (int i=0; i<solArr.length; i++){
            System.out.println(i+" -->  "+solArr[i]);
        }
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Creating a HashMap- stores at which index the number is at
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (numToIndex.containsKey(complement)) {
                 return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);

        }
        return new int[]{};
    }
}