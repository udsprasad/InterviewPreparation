package com.examples.sort;

import java.util.Arrays;

// it is used for integers
// max-min should not be larger than array.length
public class CountingSort {
    public static  void main(String[] args) {
        int[] a = new int[] {1,5,6,7,8,5,4,2};
        countingSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void countingSort(int[] a) {
        int n = a.length;
        int max = Arrays.stream(a).max().orElse(0);

        int[] count = new int[max+1];
        for(int i : a) {
            count[i]++;
        }

        for(int i=1; i<count.length; i++){
            count[i] += count[i-1];
        }
        
        int[] sortArray = new int[n];
        for(int i=n-1; i>=0;i--){
            sortArray[count[a[i]]-1] = a[i];
            count[a[i]]--;
        }

        if (n - 1 >= 0)
            System.arraycopy(sortArray, 0, a, 0, n);
    }
}
