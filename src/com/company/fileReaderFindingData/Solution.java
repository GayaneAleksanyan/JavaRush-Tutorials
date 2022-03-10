package com.company.fileReaderFindingData;

/*
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        String str;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                str = fileReader.readLine();
                assert str != null;
                if (str.startsWith(args[0] + " ")) {
                    System.out.println(str);
                }
            }
        }
    }
}
