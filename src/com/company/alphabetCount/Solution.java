package com.company.alphabetCount;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Character> englishAlphabet = Arrays.asList(
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F',
                'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W', 'X', 'Y', 'Z');

        int count = 0;
        List<Character> fromFile = new ArrayList<>();

        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                char readChar = (char) reader.read();
                fromFile.add(readChar);
            } reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < fromFile.size(); i++) {
            for (int j = 0; j < englishAlphabet.size(); j++) {
                if (fromFile.get(i).equals(englishAlphabet.get(j))) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
