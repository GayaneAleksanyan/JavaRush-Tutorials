package com.company;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 0 && (a % 2 == 0)) {
            System.out.println("отрицательное четное число");
        } else if (a < 0 && (a % 2 != 0)) {
            System.out.println("отрицательное нечетное число");
        } else if (a > 0 && (a % 2 == 0)) {
            System.out.println("положительное четное число");
        } else if (a > 0 && (a % 2 != 0)) {
            System.out.println("положительное нечетное число");
        } else if (a == 0) {
            System.out.println("ноль");
        }
    }
}
