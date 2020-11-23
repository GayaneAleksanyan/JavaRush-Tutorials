package com.company;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println(a * 2);
        } else if (a < 0) {
            System.out.println(a + 1);
        } else {
            System.out.println(a);
        }
    }
}

