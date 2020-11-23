package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Unsolved {
    public static void main(String[] args) throws IOException {
        java.util.ArrayList<String> strings = new java.util.ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        java.util.ArrayList<String> sortedStrings = (ArrayList<String>) strings.clone();

        Collections.sort(sortedStrings, (s1, s2) -> s2.length() - s1.length());

        int max = strings.indexOf(sortedStrings.get(0));
        int min = strings.indexOf(sortedStrings.get(sortedStrings.size() - 1));

        if (min < max) {
            System.out.println(strings.get(min));
        } else {
            System.out.println(strings.get(max));
        }

    }
}
