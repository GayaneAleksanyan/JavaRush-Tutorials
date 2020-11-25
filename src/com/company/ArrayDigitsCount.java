package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayDigitsCount {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        List<Integer> digits = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            digits.add(scanner.nextInt());
        }

        int current = 1;
        int max = 1;

        for (int i = 1; i < digits.size(); i++) {
            if (digits.get(i).equals(digits.get(i - 1))) {
                current++;
                if (current > max) {
                    max = current;
                }
            } else {
                current = 1;
            }
        }
        System.out.println(max);
    }
}
