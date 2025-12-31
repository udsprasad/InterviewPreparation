package com.examples.DSA_Patterns.arrays.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacter {

    public static void main(String[] args) {
        String s = "abcabcramgopalbb";
        System.out.println(lSubString(s));
    }

    private static int lSubString(String s) {
        int max =0;
        Map<Character, Integer> map = new HashMap<>();
        int start =0;
        for(int end = 0; end <s.length(); end++){
            char c = s.charAt(end);
            if(map.containsKey(c)) {
                start = Math.max(start, map.get(c)+1);
            }
            map.put(c, end);
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
