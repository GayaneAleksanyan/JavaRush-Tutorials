package com.threadRecursiveThreading;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {

        @Override
        public void run() {
            if (createdThreadCount < Solution.count) {
                System.out.println(new GenerateThread());
            }
        }

        @Override
        public String toString() {
            return (getName() + " created");
        }

        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            start();

        }
    }
}
