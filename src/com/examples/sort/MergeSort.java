package com.examples.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = new int[] {5,1,4,0,9,8};
        mergeMethod(a);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeMethod(int[] a) {
        if (a.length <= 1) return;
        int mid = a.length / 2;

        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);

        mergeMethod(left);
        mergeMethod(right);

        combineMethod(a, left, right);
    }

    private static void combineMethod(int[] a, int[] left, int[] right) {
        int i=0,j=0,k=0;

        while(i<left.length && j < right.length) {
            if (left[i] > right[j]) {
                a[k++] = right[j++];
            } else {
                a[k++] = left[i++];
            }
        }

        while (i< left.length) {
            a[k++] = left[i++];
        }

        while(j<right.length) {
            a[k++] = right[j++];
        }
    }
}
