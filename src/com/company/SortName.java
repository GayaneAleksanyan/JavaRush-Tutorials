package com.company;

import java.util.Scanner;

public class SortName {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = new String(scanner.nextLine());
        String s2 = new String(scanner.nextLine());

        if (s.equals(s2)) {
            System.out.println("Имена идентичны");
        } else if (s.length() == s2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
