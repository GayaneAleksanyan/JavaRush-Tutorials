package com.company;

import java.io.IOException;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) throws IOException {
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            array[i] = scanner.nextInt();
        }

        int sumEven = array[0] + array[2] + array[4] + array[6] + array[8] + array[10] + array[12] + array[14];
        int sumOdd = array[1] + array[3] + array[5] + array[7] + array[9] + array[11] + array[13];

        if (sumEven > sumOdd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (sumOdd > sumEven) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
