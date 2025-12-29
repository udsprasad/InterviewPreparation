package com.examples.DSA_Patterns.arrays.twoPointer;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(height));
    }

    //Start left = 0 and right = n-1
    //
    //Calculate area: min(height[left], height[right]) * (right-left)
    //
    //Move the pointer pointing to the smaller height inward
    //
    //Repeat until left >= right
    //
    //Keep track of maximum area
    private static int mostWater(int[] height) {
        int maxArea = 0, left = 0, right = height.length-1;

        while(left < right) {
            int area = Math.min(height[left], height[right]) * (right-left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left ++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
