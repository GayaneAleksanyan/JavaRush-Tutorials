package com.company;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if (a != b && a != c && b != c) {

        } else if (a != b && a != c) {
            System.out.println(1);
        }
        else if (b != a && b != c) {
            System.out.println(2);
        } else if (c != b && c != a) {
            System.out.println(3);
        }

    }
}
