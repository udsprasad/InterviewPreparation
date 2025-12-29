package com.examples.sort;

import java.util.Arrays;

public class QuickSort {
    /*
    Pick a pivot element (commonly first, last, or random).

Partition the array:

All elements ≤ pivot go left

All elements > pivot go right

Recursively apply Quick Sort to left and right subarrays.

Key idea: Each pivot ends in its final sorted position, and recursion sorts the rest*/

    public static void main(String[] args){
        int[] a = new int[]{5, 2, 4, 6, 1, 3};
        sort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int start, int end) {
        if(start<end) {
            int pivot = partition(a, start, end);
            sort(a, start, pivot-1);
            sort(a, pivot + 1, end);
        }
    }

    private static int partition(int[] a, int start, int end) {
        int pivot = a[end]; // last element as pivot
        int i = start;
        for(int j =start; j<end; j++) {
            if(a[j] < pivot) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
            }
        }
        int temp = a[i];
        a[i] = a[end];
        a[end] = temp;
        return i;
    }
}
