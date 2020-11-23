package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListString {
    private static java.util.ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        ArrayListString.strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            strings.add(reader.readLine());
        }

        Collections.sort(strings, (s1, s2) -> s2.length() - s1.length());
        int length = strings.get(0).length();
        for (String s : strings) {
            if (length == s.length()) {
                System.out.println(s);
            } else break;



//        int maxSizeString = strings.get(0).length();
//        for (String s : strings) {
//            if (s.length() > maxSizeString) {
//                maxSizeString = s.length();
//                System.out.println(maxSizeString);
//            }
        }
    }
}
