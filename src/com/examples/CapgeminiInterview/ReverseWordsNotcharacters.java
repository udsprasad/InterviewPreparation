package com.examples.CapgeminiInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWordsNotcharacters {
    public static void main(String[] args) {
        String s = "I love coding";
        // output ="coding love I";
        String result = Arrays.stream(s.split(" "))
                .collect(Collectors
                        .collectingAndThen(Collectors.toList(),
                                list-> {
                                    Collections.reverse(list);
                                  return String.join(" ", list);
                                }));
        System.out.println(result);
    }
}
