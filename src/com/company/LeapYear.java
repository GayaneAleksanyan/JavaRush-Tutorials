package com.company;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if ((a % 400) == 0) {
            System.out.println("количество дней в году: 366");
        } else if ((a % 100) == 0) {
            System.out.println("количество дней в году: 365");
        } else if ((a % 4) == 0) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }

    }
}
