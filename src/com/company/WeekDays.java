package com.company;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("понедельник");
        } else if (a == 2) {
            System.out.println("вторник");
        } else if (a == 3) {
            System.out.println("среда");
        } else if (a == 4) {
            System.out.println("четверг");
        } else if (a == 5) {
            System.out.println("пятница");
        } else if (a == 6) {
            System.out.println("суббота");
        } else if (a == 7) {
            System.out.println("воскресенье");
        } else if (a < 1) {
            System.out.println("такого дня недели не существует");
        } else if (a > 7) {
            System.out.println("такого дня недели не существует");
        }
    }
}
