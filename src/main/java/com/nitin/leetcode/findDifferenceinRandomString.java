package com.nitin.leetcode;

// 389. Find the Difference
//https://leetcode.com/problems/find-the-difference/?envType=study-plan-v2&envId=programming-skills

import java.util.HashMap;
import java.util.Map;

public class findDifferenceinRandomString {
    public static char findTheDifference(String s, String t) {
        char ch = ' ';
        Map<Integer, Character> charMaps = new HashMap<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            charMaps.put((i), (s.toCharArray()[i]));
        }

        Map<Integer, Character> charMapt = new HashMap<>();
        for (int i = 0; i < t.toCharArray().length; i++) {
            charMapt.put((i), (t.toCharArray()[i]));
        }


        for (int i = 0; i <= charMapt.size(); i++) {
            if (!charMaps.containsValue(charMapt.get(i)) && !charMaps.containsKey(charMapt.containsValue(charMapt.get(i)))) {
               //  ch = charMapt.get(i);
                break;
            }
        }

        return ch;
    }

    public static void main(String[] args) {
        char ch = findTheDifference("ba", "aa");
        System.out.println(ch);
    }
}
