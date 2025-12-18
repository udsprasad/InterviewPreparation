package com.examples.sort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args){
        int[] a = new int[]{9,0,8,2,7,4,3};
        rSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void rSort(int[] a) {
        int max = Arrays.stream(a).max().getAsInt();
        for (int exp = 1; (max/=exp) > 0; exp *=10) {

            System.out.println(max);
            max/=exp;
        }
    }
}
