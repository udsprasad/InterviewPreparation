package com.examples.DSA_Patterns.arrays.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumdivisibleByK {

    public static void main(String[] args) {
        int[] a = new int[] {4,5,0,-2,-3,1};
        System.out.println(subArray(a,5));
    }

    private static int subArray(int[] a, int key) {
        Map<Integer, Integer> map = new HashMap<>() {{
            put(0,1);
        }};
        int count =0, prefixSum =0;
        for(int i=0;i<a.length;i++){
            prefixSum+=a[i];
            int mod = ((prefixSum%key) + key) % key;
            if(map.containsKey(mod)) {
                count+=map.get(mod);
            }
            map.put(mod, map.getOrDefault(mod,0)+1);

        }
        return count;
    }
}
