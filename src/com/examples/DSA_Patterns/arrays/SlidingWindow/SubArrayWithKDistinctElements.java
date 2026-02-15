package com.examples.DSA_Patterns.arrays.SlidingWindow;

import java.util.HashMap;

public class SubArrayWithKDistinctElements {

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 3};
        int k = 2;

        int result = atMostK(a, k) - atMostK(a, k - 1);
        System.out.println(result);
    }

    public static int atMostK(int[] a, int target) {
        int start = 0, end = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (end < a.length) {
            map.compute(a[end], (k, v) -> v == null ? 1 : v + 1);

            while (map.size() > target) {
                map.put(a[start], map.get(a[start]) - 1);
                if (map.get(a[start]) == 0) {
                    map.remove(a[start]);
                }
                start++;
            }

            count += end - start + 1;
            end++;
        }
        return count;
    }

}
