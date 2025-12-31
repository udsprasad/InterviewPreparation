package com.examples.CapgeminiInterview;

// best code for sorted
// for unsorted we need to use n(n+1)/2
public class findtheMissingNumber {
    public static void main(String[] args) {
        int[] a =new int[]{1,2,4,5,7};
        for(int i = 1; i< a.length; i++) {
            int diff = a[i]-a[i-1];
            if (diff>1) {
                for (int j =1; j<diff; j++) {
                    System.out.println(a[i-1]+j);
                }
            }
        }
    }
}
