package com.inputStreamMinByte;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream readFile = new FileInputStream(reader.readLine());
        int min = 255;

        while (readFile.available() > 0) {
            int data = readFile.read();

            if (data < min) {
                min = data;
            }
        }

        readFile.close();
        System.out.println(min);
    }
}
