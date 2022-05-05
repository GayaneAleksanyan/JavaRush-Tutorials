package com.longWords;

/*
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));
        ArrayList<String> list = new ArrayList<>();

        String line;
        String[] words;

        while (bufferedReader.ready()) {
            line = bufferedReader.readLine();
            words = line.split(" ");

            for (String str : words) {
                int sum = (int) str.chars().count();
                if (sum > 6) {
                    list.add(str.trim());
                }
            }
        }
        int lenght = list.size();
        String p = "";
        for (int i = 0; i < list.size(); i++) {
            if (i == lenght - 1) {
                p = list.get(i);
            } else {
                p = list.get(i) + ",";
            }
            bufferedWriter.write(p);

        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
