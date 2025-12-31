package com.examples.DSA_Patterns.arrays.SlidingWindow;

public class MaximumAverageSubArray {
    public static void main(String[] s) {
        int[] a = new int[] {1,12,-5,-6,50,3};
        System.out.println(maxAverageSub(a, 4));
    }

    private static double maxAverageSub(int[] a, int key) {
        double maxAverage, sum =0;

        for (int i =0; i< key; i++) {
            sum+=a[i];
        }
        maxAverage = sum/key;

        for(int i = key; i<a.length;i++){
            sum = sum - a[i-key] /* removing old element*/ + a[i];
            maxAverage = Math.max(maxAverage, sum/key);
        }

        return maxAverage;
    }

}
