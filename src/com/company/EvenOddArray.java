package com.company;

import java.io.IOException;
import java.util.Scanner;

public class EvenOddArray {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String num = Integer.toString(number);
        int[] newNumber = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            newNumber[i] = num.charAt(i) - '0';

            if (newNumber[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int a = even;
        int b = odd;
        System.out.println("Even: " + a + " Odd: " + b);
    }
}
