package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListRange {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        java.util.ArrayList<String> lines = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lines.add(reader.readLine());
        }

        String a = lines.get(0);
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).length() >= a.length()) {
                a =lines.get(i);
            }
            else {
                System.out.println(i);
                break;
            }
        }
    }
}
