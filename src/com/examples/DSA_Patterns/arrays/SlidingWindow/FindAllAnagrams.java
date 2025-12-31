package com.examples.DSA_Patterns.arrays.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagrams {
    public static void main(String[] args){
        String s = "cbaebabacd", p = "bac";
        System.out.println(findallAnagramWithXOR(s,p)); // it doesn't works in all cases
        System.out.println(findallAnagram(s,p));

    }

    private static List<Integer>  findallAnagram(String s, String p) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : p.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        int count = map.size();
        int end=0, start=0;
        while(end < s.length()) {
            char c = s.charAt(end);
            if(map.containsKey(c)) {
                map.put(c, map.get(c)-1);
                if(map.get(c) ==0) count--;
            }
            end++;

            while(end-start == p.length()){
                if(count==0) result.add(start);

                char l = s.charAt(start);
                if(map.containsKey(l)) {
                    if(map.get(l)==0) count++;
                    map.put(l, map.get(l)+1);
                }
                start++;
            }
        }
        return result;
    }

    private static List<Integer> findallAnagramWithXOR(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int xor =0;
        for(char c: p.toCharArray()){
            xor^=c;
        }

        for(int i=0;i<s.length()-p.length()+1;i++){
            int temp = 0;
            for (char c: s.substring(i,i+p.length()).toCharArray()){
                temp^=c;
            }

            if (temp == xor){
                result.add(i);
            }

        }
        return result;
    }
}
