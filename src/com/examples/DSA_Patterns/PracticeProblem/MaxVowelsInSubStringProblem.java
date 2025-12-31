package com.examples.DSA_Patterns.PracticeProblem;

public class MaxVowelsInSubStringProblem {
    public static void main(String[] args){
        String s = "abciiidef";
        System.out.println(maxvowel(s));
    }

    private static int maxvowel(String s) {
        int max =0, count = 0;
        for(int end = 0; end <s.length(); end++){
            if("aeiou".contains(String.valueOf(s.charAt(end)))) {
                count++;
            } else {
                count=0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
