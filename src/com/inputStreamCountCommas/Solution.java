package com.inputStreamCountCommas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream readFile = new FileInputStream(reader.readLine());
        int sum = 0;

        while (readFile.available() > 0) {
            int count = readFile.read();
            if (count == 44) {
                sum++;
            }
        }
        readFile.close();
        System.out.println(sum);
    }

}
