package com.examples.DSA_Patterns.arrays.kadanes;

public class MaximumSumSubArray {
    public static void main(String[] args){
        int[] a = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(a));
    }

    private static int maxSum(int[] a) {
        int max =Integer.MIN_VALUE, sum =0;
        for (int j : a) {
            sum += j;
            sum = Math.max(sum, j);
            max = Math.max(max, sum);
        }
        return max;
    }
}
