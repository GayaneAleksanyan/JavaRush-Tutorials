package com.inputStreamMaxByte;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream readFile = new FileInputStream(reader.readLine());
        int max = 0;

        while (readFile.available() > 0) {
            int data = readFile.read();

            if (data > max) {
                max = data;
            }
        }
        readFile.close();
        System.out.println(max);
    }
}
