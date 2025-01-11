package com.nitin.leetcode;

/*You are given two strings word1 and word2.
Merge the strings by adding letters in alternating order, starting with word1.
If a string is longer than the other,
append the additional letters onto the end of the merged string.

Return the merged string.*/

public class alternateWords {

    public static void main(String[] args) {

        mergeAlternately1("abc", "pqrs");
        mergeAlternately2("abc", "pqrs");
        mergeAlternately3("abc", "pqrs");
    }

    private static String mergeAlternately2(String word1, String word2) {
        String final_Word = "";


        int n = word1.length() <= word2.length() ? word1.length() : word2.length(); //smallest length
//        int m = word1.length()>=word2.length()? word1.length():word2.length();  //biggest


        for (int i = 0; i < n; i++) {
            final_Word += (String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i)));
        }
        if (word1.length() > word2.length())
            final_Word += word1.substring(n, word1.length());
        else {
            final_Word += word2.substring(n, word2.length());
        }
        System.out.println("2-"+final_Word);
        return final_Word;
    }

    public static String mergeAlternately3(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            s.append(word1.charAt(i++));
            s.append(word2.charAt(j++));
        }
        if (i < word1.length())
            s.append(word1.substring(i));
        if (j < word2.length())
            s.append(word2.substring(j));

        System.out.println("3-"+s);
        return s.toString();
    }

    public static String mergeAlternately1(String word1, String word2) {
        String s = "";

        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            s += word1.charAt(i);
            s += word2.charAt(j);
            i++;
            j++;
        }
        while (i < word1.length()) {
            s += word1.charAt(i);
            i++;
        }
        while (j < word2.length()) {
            s += word2.charAt(j);
            j++;
        }
        System.out.println("1-"+s);
        return s;
    }

    private static void printingArrays(char[] arr) {
        System.out.println("Array of index length: " + arr.length);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("]");
    }
}
