package com.wordsWithNumbers;

/*
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));

        String line;
        String[] words;

        while (bufferedReader.ready()) {
            line = bufferedReader.readLine();
            words = line.split(" ");
            for (String word : words) {
                if (word.matches(".*[0-9].*")) {
                    bufferedWriter.write(word + " ");
                }
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
