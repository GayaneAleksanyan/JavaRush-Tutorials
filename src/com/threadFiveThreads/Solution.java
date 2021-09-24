package com.threadFiveThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
        for (int i = 0; i <= threads.size(); i++) {
            threads.get(i).start();
        }
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
                while (true) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                    System.out.println("Thread1 is working");
                }
            }
        }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        public static volatile boolean isAlive = false;

        @Override
        public void run() {
            while (!isAlive) {
            }
        }
        @Override
        public void showWarning() {
            isAlive = true;
        }
    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            while (scanner.hasNextInt()){
                sum += scanner.nextInt();
            }
            System.out.println(sum);
        }
    }
}