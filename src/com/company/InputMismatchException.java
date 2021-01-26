package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        try {
            while (true) {
                int a = scanner.nextInt();
                list.add(a);
            }
        } catch (java.util.InputMismatchException e) {
            for (Integer b : list) {
                System.out.println(b);
            }
        }
    }
}
