package com.threadTestThreadStop;

/* 
А без interrupt слабо?
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        TestThread.stop();
    }


    public static class TestThread implements Runnable {
        static boolean exit = false;
        public void run() {
            while (!exit) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
        public static void stop() {
            exit = true;
        }
    }
}
