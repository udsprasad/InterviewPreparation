package com.examples.DSA_Patterns.arrays.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsToK {

    public static void main(String[] args) {
        int[] a = new int[] {1,1,1};
        System.out.println(subArrayForNonNegativeNumbers(a,2));
        System.out.println(subArrayForNegativeNumbers(a,2));
    }

    // here map stores prefix and its count;
    private static int subArrayForNegativeNumbers(int[] a, int key) {
        int count = 0, currentSum = 0;
        Map<Integer, Integer> map = new HashMap<>() {{
            put(0,1); // initial condition
        }};

        for (int i=0; i<a.length; i++){
            currentSum+=a[i];
            if(map.containsKey(currentSum-key)) {
                count+=map.get(currentSum-key);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0)+1);
        }

        return count;
    }

    // sliding window is correct
    // if the array contains non-negative numbers (all elements ≥ 0).
    private static int subArrayForNonNegativeNumbers(int[] a, int key) {
        int count =0, j=0, sum =0;
        for (int i=0; i<a.length; i++){
            sum +=a[i];
            while(sum>=key) {
                if (sum == key) {
                    count++;
                }
                sum-=a[j];
                j++;
            }
        }
        return count;
    }
}
