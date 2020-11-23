package com.company;

import java.util.Scanner;

public class IntCount2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] numbers  = new int [3];
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0){
                pos++;
            }
            else if (numbers[i] < 0 && numbers [i] != 0){
                neg++;
            }
        }
        System.out.println("Количество отрицательных чисел: " + neg);
        System.out.println("Количество положительных чисел: " + pos);
    }
}
