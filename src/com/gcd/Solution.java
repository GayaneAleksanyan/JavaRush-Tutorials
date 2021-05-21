package com.gcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            if (a <= 0 || b <= 0) {
                throw new NumberFormatException();
            } else {
                System.out.println(gcd(b, a % b));
            }
        } catch (IOException ignored) {
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}



