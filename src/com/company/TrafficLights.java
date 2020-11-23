package com.company;

import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int b = (int) a / 5;
        double c = a - (b * 5);

        if (c < 3) {
            System.out.println("зелёный");
        } else if (c >= 3 && c <4 ) {
            System.out.println("жёлтый");
        } else {
            System.out.println("красный");
        }
    }
}
