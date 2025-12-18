package com.examples.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[]{9,5,8,0,1,3,4};
        int target = 1;
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
