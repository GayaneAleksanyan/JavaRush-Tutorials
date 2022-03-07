package com.company.spaceCount;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Character> charList = new ArrayList<>();
        int charCount = 0;
        int spaceCount = 0;
        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                char readFile = (char) reader.read();
                charList.add(readFile);
            } reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < charList.size(); i++) {
            charCount++;
            if ((charList.get(i).equals(' '))) {
                spaceCount++;
            }
        }
        float out = (float) spaceCount/charCount*100;
        System.out.printf("%.2f", out);
    }
}
