package com.listOfThreads;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
         for (int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread()));
         }
        for(Thread thread : list)
            System.out.println(thread.getName());
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
