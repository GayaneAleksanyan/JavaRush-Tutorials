package com.inputStreamFileDivision;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        FileInputStream f1 = new FileInputStream(s1);
        FileOutputStream f2 = new FileOutputStream(s2);
        FileOutputStream f3 = new FileOutputStream(s3);

        int allBytes = f1.available();
        int halfBytes = (allBytes + 1) / 2;

        byte[] buffer = new byte[655366];
        int count = f1.read(buffer);

        f2.write(buffer, 0, halfBytes);
        f3.write(buffer, halfBytes, allBytes - halfBytes);

        f1.close();
        f2.close();
        f3.close();

    }

}
