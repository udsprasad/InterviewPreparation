package com.examples.DSA_Patterns.arrays.twoPointer;

import java.util.Arrays;

public class MoveZerosRight {
    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeros(height)));
    }

    private static int[] moveZeros(int[] height) {
        int k =0;
        for (int i =0; i<height.length; i++){
            if (height[i]!=0) {
                height[k++] = height[i];
            }
        }

        while(k<height.length) {
            height[k++] = 0;
        }

        return height;
    }
}
