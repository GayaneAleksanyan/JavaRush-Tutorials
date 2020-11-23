package com.company;

import java.io.IOException;

public class MainClass {

        public static void main(String[] args) throws IOException {
            int[] list = new int[10];

            //заполнение массива
            for (int i = 0; i < list.length; i++) {
                list[i] = i;
                System.out.println(list[i]);

                //вывод на экран


            }
        }
    }
