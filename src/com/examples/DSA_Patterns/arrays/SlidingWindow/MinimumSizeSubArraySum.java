package com.examples.DSA_Patterns.arrays.SlidingWindow;

public class MinimumSizeSubArraySum {

    public static void main(String[] args) {
        int[] a = new int[] {0,3,1,2,4,3};
        System.out.println(minSub(a, 0));
    }

    private static int minSub(int[] a, int key) {
        int min = a.length, start =0, sum = 0;
        for(int end =0; end<a.length; end++) {
            sum+=a[end];
            while(sum>=key && /*Why i added start<=end condition to work with 0 at initial*/
                    start <= end){
                if (sum == key) min = Math.min(min, end - start + 1);
                sum-=a[start++];
            }
        }
        return min == a.length ? 0: min;
    }
}
