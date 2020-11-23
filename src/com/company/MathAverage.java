package com.company;

import java.util.Scanner;

public class MathAverage {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        int count = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == -1)
                break;

            sum += number;
            count++;

        } System.out.println(sum / count);
    }
}
