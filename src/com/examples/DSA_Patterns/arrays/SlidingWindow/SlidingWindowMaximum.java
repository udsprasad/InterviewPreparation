package com.examples.DSA_Patterns.arrays.SlidingWindow;

import java.util.*;

public class SlidingWindowMaximum {

    public static void main(String[] args){
        int[] a = new int[] {1,3,-1,-3,5,3,6,7}; // Output: [3,3,5,5,6,7]
        System.out.println(Arrays.toString(slidingWindowWithPriority(a,3)));
        System.out.println(Arrays.toString(slidingWindowWithOpt(a,3)));
    }

    private static int[] slidingWindowWithOpt(int[] a, int key) {
        int n = a.length;
        int[] result = new int[n-key+1];

        // element should be descending order
        Deque<Integer> queue = new ArrayDeque<>(); // stores indices
        for(int i=0;i<a.length; i++) {

            // 1️⃣ Remove indices out of window
            while (!queue.isEmpty() && queue.peekFirst() <= i - key) {
                queue.pollFirst();
            }

            // checking whether elements in last is less than the current element
            // if yes, remove it because we need max
            while (!queue.isEmpty() && a[queue.peekLast()] < a[i]){
                queue.pollLast();
            }

            queue.offerLast(i);

            if(i-key+1 >= 0 && !queue.isEmpty()) {
                result[i-key+1] = a[queue.peekFirst()];
            }
        }
        return result;
    }

    private static int[] slidingWindowWithPriority(int[] a, int key) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int start =0, end=0;
        while(end < a.length) {
            pq.offer(a[end++]);
            if (pq.size() == key) {
                list.add(pq.peek());
                pq.remove(a[start]);
                start++;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
