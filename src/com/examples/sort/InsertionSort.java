package com.examples.sort;

import java.util.Arrays;
public class InsertionSort {
    /*
    *Think of sorting a hand of playing cards:

Start with the second card in your hand.

Compare it with the card(s) to its left.

Shift all cards larger than it one step to the right.

Insert the card in its correct position.

Repeat until the whole hand is sorted.

Key idea: You maintain a sorted portion on the left and insert each
* new element in the right place*/

    public static void main(String[] args) {
        int[] a = new int[]{5, 2, 4, 6, 1, 3};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a) {
        int n = a.length;

        for(int i=1; i<n; i++) {
            int key = a[i]; // it is a key with we are going to compare
            int j = i - 1; // till i-1 all elements are already sorted
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];  // if key is smaller than a[j] then move one step right
                j--;
            }
            a[j+1] = key;
        }
    }
}