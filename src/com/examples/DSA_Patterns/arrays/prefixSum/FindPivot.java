package com.examples.DSA_Patterns.arrays.prefixSum;

import java.util.HashMap;

public class FindPivot {

    public static void main(String[] args) {
        int[] a = new int[] {1,7,3,6,5,6};
        System.out.println(findPivot(a));
        System.out.println(findPivotOpt(a));
    }

    private static int findPivot(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = a.length;
        int prefixSum =0;
        for (int i = 0; i< n; i++) {
            prefixSum +=a[i];
            map.put(i, prefixSum);
        }

        int lastIndexPrefix = map.get(n-1);
        for (int i=1; i< n-1; i++){
            if (map.get(i-1).equals(lastIndexPrefix - map.get(i))) {
                return i;
            }
        }

        return -1;
    }


    // optimised solution for both time and space complexity
    private static int findPivotOpt(int[] a){
        int n =a.length, totalSum =0, leftSum=0;
        for (int i : a) {
            totalSum+=i;
        }

        for(int i =0; i<n; i++){
            int rightSum = totalSum - a[i] - leftSum;
            if (rightSum == leftSum) {
                return i;
            }
            leftSum+=a[i];
        }

        return -1;
    }
}
