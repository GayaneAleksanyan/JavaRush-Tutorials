package com.threadPrintMsg;

/* 
Thread.currentThread - всегда возвращает текущую нить
*/

public class Solution {
    static int count = 5;

    public static void main(String[] args) throws InterruptedException {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                try {
                    printMsg();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printMsg() throws InterruptedException {
            Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println("Name=" + name);
            Thread.sleep(1);
        }
    }
}
