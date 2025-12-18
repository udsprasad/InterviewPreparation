package com.examples.CapgeminiInterview;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5};
        int target = 2;
        rotateByK(a,target);
        System.out.println(Arrays.toString(a));
    }

    private static void rotateByK(int[] a, int target) {
        int n = a.length;
        swap(a, n-target, n-1);
        swap(a, 0, n-target-1);
        swap(a, 0, n-1);
    }

    private static void swap(int[] a, int start, int end) {
       while(start<end) {
           int temp = a[start];
           a[start] = a[end];
           a[end] = temp;
           start++;
           end--;
       }
    }
}
