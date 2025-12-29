package com.examples.DSA_Patterns.arrays.twoPointer;

import java.util.Arrays;

// general two sum works with hashmap, because it is not sorted;
// if it is sorted with can use
// two pointer one is start from beginning and another is last
public class TwoSumForSorted {

    public static void main(String[] args) {
        int[] a = new int[] {2,7,11,15};
        int target = 22;
        System.out.println(Arrays.toString(twoSum(a, target)));
    }

    private static int[] twoSum(int[] a, int target) {
        int start =0, end = a.length-1;
        while (start < end) {
            int sum = a[start] +a[end];
            if (sum == target) return new int[] {start, end};
            else if (sum < target) start++;
            else end--;
        }
        return new int[0];
    }
}
