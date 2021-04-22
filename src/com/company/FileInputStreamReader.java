package com.company;

import java.io.*;

public class FileInputStreamReader {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        InputStream in = new FileInputStream(fileName);

        while (in.available() > 0) {
            int text = in.read();
            System.out.print((char) text);
        }

        in.close();
        reader.close();

    }
}
