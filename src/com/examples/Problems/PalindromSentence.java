package com.examples.Problems;

public class PalindromSentence {
        public static void main(String[] args) {
            String s = "Able was I ere I saw Elba";
            s = s.toLowerCase().replaceAll("\\s+", "");

            int i = 0, j = s.length() - 1;

            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    System.out.println("Not Palindrome");
                    return;
                }
                i++;
                j--;
            }
            System.out.println("Palindrome");
        }
}
