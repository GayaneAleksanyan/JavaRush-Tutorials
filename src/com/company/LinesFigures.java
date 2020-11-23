package com.company;

import java.util.Scanner;

public class LinesFigures {
    public static void main(String[] args) throws Exception {
        String[] lines = new String[10];
        int[] figures = new int[10];

        for (int i = 0; i < lines.length; i++) {
            Scanner scanner = new Scanner(System.in);
            lines[i] = scanner.nextLine();
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i] = lines[i].length();
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i]);
        }
    }
}
