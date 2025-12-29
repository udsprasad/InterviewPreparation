package com.examples.BasicProblems;

public class PalindromString {
    public static void main(String[] args) {
        String s = "mariam";
        int start = 0, end = s.length()-1;
        while(start<end) {
            if(s.charAt(start)!=s.charAt(end)) {
                System.out.println("Not Palindrom");
                return;
            }
            start++;
            end--;
        }
        System.out.println("palindrom");
    }
}
