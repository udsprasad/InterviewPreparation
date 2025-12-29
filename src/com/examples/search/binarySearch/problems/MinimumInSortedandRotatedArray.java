package com.examples.search.binarySearch.problems;

public class MinimumInSortedandRotatedArray {

    public static void main(String[] args){
        int[] a = new int[]{3,4,5,0,1,2};
        System.out.println(minimumOwn(a));
    }

    private static int minimumOwn(int[] a) {
        int start =0, end = a.length-1;
        while(start < end) {
            int mid = start + (end - start)/2;
            if (a[mid] > a[end]) start = mid+1;
            else end = mid;
        }
        return end;
    }
}
