package com.company;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= b) {
            System.out.println(a);
        } else if (a >= b) {
            System.out.println(b);
        }
    }
}

