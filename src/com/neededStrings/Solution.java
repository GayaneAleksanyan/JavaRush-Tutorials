package com.neededStrings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader readFile = new BufferedReader(new FileReader(fileName));
        while (readFile.ready()) {
            String readedString = readFile.readLine();
            String[] splitted = readedString.split(" ");

            int wordCount = 0;
            for (String countedWords : splitted) {
                if (words.contains(countedWords)) {
                    wordCount++;
                }
            }
            if (wordCount == 2) {
                System.out.println(readedString);
            }
        }
        reader.close();
        readFile.close();
    }
}
