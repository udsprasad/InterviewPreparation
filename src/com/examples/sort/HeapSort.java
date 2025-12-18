package com.examples.sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] a = new int[]{5, 2, 4, 6, 1, 3};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a) {
        int n = a.length;

        // creating max heap
        for(int i = (n/2)-1 ; i>=0; i--) {
            heapify(a, n, i);
        }

        //Repeat until heap is empty:
        //Swap root (a[0]) with last element of heap
        //Heapify root again with heap size here i is the heap size
        //Reduce heap size by 1
        for(int i = n-1; i>0; i--) {
            int temp = a[i];
            a[i] = a[0];
            a[0] = temp;

            heapify(a, i, 0);
        }

    }

    private static void heapify(int[] a, int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && a[left] > a[largest]) {
            largest = left;
        }
        if (right < n && a[right] > a[largest]) {
            largest = right;
        }

        // finding the largest value within right, left, largest
        // then swap and heapify
        if (largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            heapify(a, n, largest);
        }
    }

}
