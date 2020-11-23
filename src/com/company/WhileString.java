package com.company;

import java.util.Scanner;

public class WhileString {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            int a = scanner.nextInt();

            while (a > 0) {
                System.out.println(s);
                a--;

            }


        }

    }
