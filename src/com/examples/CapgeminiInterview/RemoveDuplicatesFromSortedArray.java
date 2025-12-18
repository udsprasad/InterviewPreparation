package com.examples.CapgeminiInterview;


import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] a = new int[]{2,2,3,3,3,4,5,5};
        System.out.println(Arrays.toString(removeDup(a)));
    }

    private static int[] removeDup(int[] a) {
        int j=0;
        for(int i = 1; i< a.length; i++){
            if (a[i-1] != a[i]) {
                a[j++] = a[i-1];
            }
        }
        a[j] = a[a.length-1];
        return Arrays.copyOfRange(a,0,j+1);
    }
}
