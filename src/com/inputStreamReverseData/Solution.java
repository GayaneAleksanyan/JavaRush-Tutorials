package com.inputStreamReverseData;

/*
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String s = buff.readLine();
        String s1 = buff.readLine();
        try (FileInputStream fis = new FileInputStream(s);
             FileOutputStream fis1 = new FileOutputStream(s1)) {
            List<Integer> x = new ArrayList<>();
            while (fis.available() > 0) {
                x.add(fis.read());
            }
            Collections.reverse(x);
            for (Integer a : x) {
                fis1.write(a);
            }
        }
    }
}
