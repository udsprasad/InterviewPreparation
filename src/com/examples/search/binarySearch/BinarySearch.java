package com.examples.search.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7};
        int target = 6;
        System.out.println(binarySearchOwn(a, 0, a.length-1, target));
    }

    private static int binarySearchOwn(int[] a, int start, int end, int target) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == target) return mid;
            else if (a[mid] < target) return binarySearchOwn(a, mid + 1, end, target);
            else if (a[mid] > target) return binarySearchOwn(a, start, mid - 1, target);
        }
        return -1;
    }
}
