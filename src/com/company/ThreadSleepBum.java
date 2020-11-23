package com.company;

public class ThreadSleepBum {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            Thread.sleep(100);
        }

        System.out.println("Бум!");
    }
}
