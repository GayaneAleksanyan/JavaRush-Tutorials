package com.company;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) throws Exception {
        int[] digits = new int[10];

        for (int i = 0; i < digits.length; i++) {
            Scanner scanner = new Scanner(System.in);
            digits[i] = scanner.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(digits[i]);
        }
    }
}
