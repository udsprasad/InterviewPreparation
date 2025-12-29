package com.examples.VISAInterview;

//Time Complexity should be O(log n)
// Binary search modified
public class MinimumInSortAndRotatedArray {
    public static void main(String[] args){
        int[] a = new int[]{4,5,0,1,2,3};
        System.out.println(minimum(a, 0, a.length-1));
    }

    private static int minimum(int[] a, int start, int end) {
        if (start == end) return a[end];
        int mid = start + (end - start) / 2;
        if (a[mid] > a[end]) {
            return minimum(a, mid + 1, end);
        } else  {
            return minimum(a, start, mid);
        }
    }
}
