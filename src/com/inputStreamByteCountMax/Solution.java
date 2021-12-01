package com.inputStreamByteCountMax;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream readFile = new FileInputStream(reader.readLine());
        ArrayList<Integer> toPrint = new ArrayList<>();

        int[] byteArray = new int[256];

        while (readFile.available() > 0) {
            int data = readFile.read();
            byteArray[data] = byteArray[data] + 1;
        }
        readFile.close();

        int maxCount = Integer.MIN_VALUE;
        for (int byteCount : byteArray) {
            if (byteCount > 0 && byteCount > maxCount) {
                maxCount = byteCount;
            }
        }
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] == maxCount) {
                toPrint.add(i);
            }
        }
        for (Integer printList : toPrint) {
            System.out.print(printList + " ");
        }
    }
}
