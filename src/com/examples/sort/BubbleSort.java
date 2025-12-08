package com.examples.sort;

import java.util.Arrays;

public class BubbleSort {

    /*
          bubble sort will compare with adjacent elements
          and bring the larger element to last for every pass

          time complexity: O(n*n)
    */

    public static void main(String[] args) {
        int[] a = new int[]{5, 2, 4, 6, 1, 3};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a) {
        int n = a.length;

        // here i<n-1 because we require n-1 iterations/passes to sort
        for(int i=0; i<n-1; i++) {
            // here j<n-i-1 because here -i represents for every pass one element will be sorted so,
            // we are ignore that element in every pass
            // -1 means when we compare adjacents right at that time we should not get
            // arrayoutofbound
            for(int j=0; j<n-i-1; j++) {
                if(a[j]>a[j+1]){
                    int xor = a[j]^a[j+1];
                    a[j] = xor ^ a[j];
                    a[j+1] = xor ^ a[j+1];
                }
            }


        }
    }
}
