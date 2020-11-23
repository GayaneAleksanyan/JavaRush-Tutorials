package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReturnMathMax {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;

        int a = Integer.parseInt(reader.readLine());
        if (a > 0) {
            for (int i = 0; a > i; i++) {
                int b = Integer.parseInt(reader.readLine());
                if (maximum < b)
                    maximum = b;
            }
            System.out.println(maximum);
        }
    }
}
