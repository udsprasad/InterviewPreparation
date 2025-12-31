package com.examples.DSA_Patterns.arrays.prefixSum;

import java.util.HashMap;

public class ContinuousSubArraySum {

    //Find i, j such that sum(nums[i..j]) % k == 0 and j - i >= 1
    public static void main(String[] s) {
        int[] a = new int[] {23,2,6,4,7};
        System.out.println(conSubArraySum(a, 6));
    }

    private static boolean conSubArraySum(int[] a, int key) {
        HashMap<Integer, Integer> map = new HashMap<>() {{
            put(0,-1);
        }};
        int prefixSum = 0;
        for(int i =0; i< a.length; i++){
            prefixSum+=a[i];
            int mod = prefixSum%key; // this works for positive
            // int mod = ((prefixSum%key) + key)%key) this works for negative

            if(map.containsKey(mod)) {
                if (i - map.get(mod) >= 2) return true;
            }
            map.putIfAbsent(mod, i);
        }

        return false;
    }

}
