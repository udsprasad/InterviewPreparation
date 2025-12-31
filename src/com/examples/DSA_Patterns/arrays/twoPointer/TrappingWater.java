package com.examples.DSA_Patterns.arrays.twoPointer;

public class TrappingWater {
    
    public static void main(String[] args) {
        int[] a = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedWater(a));
    }

    //Water above a block depends on:
    //
    //Highest block on the left
    //
    //Highest block on the right
    //
    //Important Rule:
    //
    //Water at position i is limited by the shorter of the two sides.
    private static int trappedWater(int[] a) {
        int left = 0, right = a.length-1, maxLeft=0,maxRight=0, water =0;
        while(left < right) {
            if (a[left] < a[right]) {
                maxLeft = Math.max(maxLeft, a[left]);
                water += maxLeft - a[left];
                left++;
            } else {
                maxRight = Math.max(maxRight, a[right]);
                water += maxRight - a[right];
                right--;
            }
        }
        return water;
    }
}
