package com.examples.DSA_Patterns.arrays.SlidingWindow;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int[] a = {10,5,2,6};
        int k = 100, count =0, product = 1, start = 0, end =0;
        while(end < a.length) {
            product *= a[end];
            while(product >= 100 && start<=end) {
                product/=a[start];
                start++;
            }
            count += end - start + 1; // end-start+1 will give the length of the array here
                                     // length of the arrays is same has subarray count
            end++;
        }
        System.out.println(count);
    }
}
