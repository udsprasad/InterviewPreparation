package com.examples.DSA_Patterns.arrays.twoPointer;

import java.util.Arrays;

public class MoveZerosLeft {
    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeros(height)));
    }

    private static int[] moveZeros(int[] height) {
        int k = height.length-1;
        for (int i =height.length-1; i>=0; i--){
            if (height[i]!=0) {
                height[k--] = height[i];
            }
        }

        while(k>=0) {
            height[k--] = 0;
        }

        return height;
    }
}
