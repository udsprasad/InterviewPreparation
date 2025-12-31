package com.examples.DSA_Patterns.arrays.kadanes;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int[] a = new int[] {7,1,5,3,6,4,10};
        System.out.println(profit(a));
    }

    private static int profit(int[] a) {
        int maxProfit =0, minPrice = a[0];
        for(int i=0; i< a.length; i++){
            minPrice = Math.min(minPrice, a[i]);
            int profit = a[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
