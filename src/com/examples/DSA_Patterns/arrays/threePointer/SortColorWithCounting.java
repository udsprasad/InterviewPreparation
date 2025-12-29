package com.examples.DSA_Patterns.arrays.threePointer;

import java.util.Arrays;

// best in interviews because it use O(n+k) time and O(k) space
public class SortColorWithCounting {
    public static void main(String[] args) {
        int[] a = new int[] {2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(sortColorOwn(a)));
    }

    private static int[] sortColorOwn(int[] a) {
        int[] count  = new int[3];

        for(int i=0; i<a.length;i++) {
            count[a[i]]++;
        }

        for(int i=1; i<count.length;i++) {
            count[i] +=count[i-1];
        }

        int[] sortArray = new int[a.length];
        for (int i = a.length-1; i>=0; i--) {
            sortArray[count[a[i]]-1] = a[i];
            count[a[i]]--;
        }

        return sortArray;
    }
}
