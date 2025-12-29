package com.examples.DSA_Patterns.arrays.twoPointer;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumForUnsorted {
    public static void main(String[] args) {
        int[] a = new int[] {9,3,5,1,7,4,6,2,8};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(a, target)));
    }

    private static int[] twoSum(int[] a, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            int complimentary = target - a[i];
            if (map.containsKey(complimentary)) {
                return new int[] {i, map.get(complimentary)};
            }
            map.putIfAbsent(a[i], i);
        }
        return new int[0];
    }
}
