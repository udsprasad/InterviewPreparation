package com.examples.CapgeminiInterview;

public class AllHashes {

    public static void main(String[] args){
        String s = "a#b#c#d";
        String output ="###abc";
        System.out.println(moveHashesToFront(s));
    }

    private static String moveHashesToFront(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c!='#') {
                sb.append(c);
            }
        }
        int padding = s.length() - sb.length();
        if (padding >0){
            sb.insert(0, "#".repeat(padding));
        }
        return sb.toString();
    }
}
