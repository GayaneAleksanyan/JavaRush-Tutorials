package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LinesArray {
    public static void main(String[] args) throws Exception {
        java.util.ArrayList<String> lines = new ArrayList<String>();
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            lines.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            String s = lines.get(4);
            lines.remove(4);
            lines.add(0, s);
        }
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
    }
}
