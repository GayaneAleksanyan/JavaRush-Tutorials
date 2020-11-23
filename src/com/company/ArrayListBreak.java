package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListBreak {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        java.util.ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String line = reader.readLine();
            if (line.equals("end")) {
                break;
            } strings.add(line);
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

    }
}
