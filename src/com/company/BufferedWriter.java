package com.company;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedWriter {
    public static String string;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        java.io.BufferedWriter writer = new java.io.BufferedWriter(new FileWriter(reader.readLine()));

        do {
            string = reader.readLine();

            writer.write(string + "\n");
            writer.flush();
        } while (!string.equals("exit"));

        writer.close();
    }
}
