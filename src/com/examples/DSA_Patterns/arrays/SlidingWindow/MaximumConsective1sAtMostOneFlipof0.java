package com.examples.DSA_Patterns.arrays.SlidingWindow;

public class MaximumConsective1sAtMostOneFlipof0 {

    public static void main(String[] args) {
        int[] a = {1,1,0,1,0,1,1,1,0,1,1,0,1,1,1};
        int zeroCount = 0, zeroLastIndex = 0, start = 0, end =0, max =0;

        while(end < a.length) {
            if (a[end] == 0) zeroCount++;
            while (zeroCount > 1) {
                if (a[start] == 0) zeroCount--;
                start++;
            }
            max = Math.max(max, end - start + 1);
            end++;
        }
        System.out.println(max);
    }
}
