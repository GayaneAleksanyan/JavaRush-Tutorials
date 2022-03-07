package com.fileReaderWriter;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileWriter writer = new FileWriter(file1);
        FileReader reader1 = new FileReader(file2);
        FileReader reader2 = new FileReader(file3);

        while (reader1.ready()) {
            int data = reader1.read();
            writer.write(data);
        }

        while (reader2.ready()) {
            int data2 = reader2.read();
            writer.write(data2);
        }
        reader1.close();
        reader2.close();
        writer.close();

    }
}
