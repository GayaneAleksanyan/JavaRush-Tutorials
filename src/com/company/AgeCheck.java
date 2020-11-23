package com.company;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = new String(scanner.nextLine());
        int a = scanner.nextInt();

        if (a < 18) {
            System.out.println("Подрасти еще");
        }


    }
}
