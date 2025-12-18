package com.examples.CapgeminiInterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// input : aaabbcccdd
//output: a3b2c3d2
public class StringCompression {
    public static void main(String[] args) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        // key point using likedHashmap for insertion order
        for(char c: "aaabbcccdd".toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map.entrySet().stream()
                .map(entry ->
                        ""+entry.getKey()+entry.getValue()).
                collect(Collectors.joining()));
    }
}
