package com.examples.DSA_Patterns.arrays.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasket {

    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,2,1};
        System.out.println(fruits(a));
    }

    //You are given an array fruits where each element represents a type of fruit.
    //
    //You have two baskets, and each basket can hold only one type of fruit, but any number of that type.
    //
    //👉 You must pick a contiguous subarray containing at most 2 distinct fruit types.

    private static int fruits(int[] a) {
        int max =0, start=0, end=0;
        Map<Integer, Integer> map = new HashMap<>();
        while(end<a.length) {
            map.putIfAbsent(a[end], map.getOrDefault(a[end],0)+1);
            while (map.size()>2) {
                map.put(a[start],map.get(a[start])-1);
                if(map.get(a[start])==0) {
                    map.remove(a[start]);
                }
                start++;
            }
            max = Math.max(max, end-start+1);
            end++;
        }

        return max;
    }

}
