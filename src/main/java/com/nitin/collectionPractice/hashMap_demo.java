package com.nitin.collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class hashMap_demo {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c != ' ') { // Skip spaces
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Character Count Map: " + charCountMap);
    }
}
