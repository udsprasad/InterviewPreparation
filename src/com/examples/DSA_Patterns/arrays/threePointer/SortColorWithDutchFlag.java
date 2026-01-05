package com.examples.DSA_Patterns.arrays.threePointer;

import java.util.Arrays;

// best in interviews because it use O(n) time and O(1) space
public class SortColorWithDutchFlag {

    public static void main(String[] args) {
        int[] a = new int[] {2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(sortColor(a)));
    }

    private static int[] sortColor(int[] a) {
        int start = 0, mid =0, end = a.length-1;

        while(mid <= end) {

            if (a[mid] == 0) {
                swapOwn(a, mid, start);
                mid++;
                start++;
            }else if (a[mid] == 2) {
                swapOwn(a, mid, end);
                end--;
            }  else if (a[mid]==1) {
                mid++;
            }
        }
        return a;
    }

    private static void swapOwn(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
