package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");

        int x = scanner.nextInt();

        System.out.println("Введите второе число");
        int y = scanner.nextInt();

        System.out.println("Введите +, -, * или /");
        String c = scanner.next();

        scanner.close();

        switch (c) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
        }
    }
}
