package com.inputStreamSortedSet;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream readFile = new FileInputStream(reader.readLine());
        int number = 0;
        Set set = new TreeSet();

        while (readFile.available() > 0) {
            number = readFile.read();
            set.add(number);
        }

        readFile.close();

        for (Object a : set) {
            System.out.print(a + " ");
        }
    }
}
