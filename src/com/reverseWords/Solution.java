package com.reverseWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader readFile = new BufferedReader(new FileReader(fileName));
        while (readFile.ready()) {
            String fileContent = readFile.readLine();
            StringBuilder str = new StringBuilder(fileContent);
            str.reverse();
            System.out.println(str);
        }
        reader.close();
        readFile.close();
    }
}
