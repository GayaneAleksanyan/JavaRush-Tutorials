package com.patternMatcherPunctuation;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstName = reader.readLine();
        String secondName = reader.readLine();
        reader.close();

        BufferedReader readFile = new BufferedReader(new FileReader(firstName));
        BufferedWriter writeFile = new BufferedWriter(new FileWriter(secondName));
        while (readFile.ready()) {
            String str = readFile.readLine();

            Pattern pattern = Pattern.compile("\\p{P}");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                String s = matcher.replaceAll("");
                writeFile.write(s);
            }
        }
        readFile.close();
        writeFile.close();
    }
}
