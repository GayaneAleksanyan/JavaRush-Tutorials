package com.company;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 1 || a > 999){
            return;
        }

        int l = Integer.toString(a).length();
        boolean m = (l == 1);
        boolean k = (l == 2);
        boolean d = (l == 3);
        boolean n = (a % 2 == 0);


        if (m && n) {
            System.out.println("четное однозначное число");
        } else if (m && !n) {
            System.out.println("нечетное однозначное число");
        } else if (k && n){
            System.out.println("четное двузначное число");
        } else if (k && !n) {
            System.out.println("нечетное двузначное число");
        } else if (d && n) {
            System.out.println("четное трехзначное число");
        } else if (d && !n) {
            System.out.println("нечетное трехзначное число");
        }

    }
}
