package com.examples.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = new int[]{9,5,8,0,1,3,4};
        int target = 0;
        for (int i =0; i < a.length; i++){
            if (a[i] == target) {
                System.out.println(i);
            }
        }
    }
}
