package com.examples.search.binarySearch.problems;

public class FindPeak {

    // If middle element is smaller than right neighbor, peak is on the right
    //Else, peak is on the left or at mid
    public static void main(String[] args) {
        int[] a = new int[] {5,1,3,2,1};
        System.out.println(findPeak(a));
    }

    private static int findPeak(int[] a) {
        int start =0, end = a.length-1;

        while (start<end) {
            int mid = start + (end -start)/2;
            if (a[mid] < a[mid+1]) start = mid+1;
            else end = mid;
        }
        return end;
    }
}
