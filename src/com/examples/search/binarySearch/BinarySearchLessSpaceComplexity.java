package com.examples.search.binarySearch;


public class BinarySearchLessSpaceComplexity {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(findMethodOwn(a, 7));
    }

    private static int findMethodOwn(int[] a, int target) {
        int start = 0, end = a.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(a[mid] == target) return mid;
            else if(a[mid] < target) start =mid+1;
            else end = mid-1;
        }
        return -1;
    }
}
