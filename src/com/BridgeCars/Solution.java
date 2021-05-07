package com.BridgeCars;

/* 
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new com.javarush.task.task14.task1409.WaterBridge());
        println(new com.javarush.task.task14.task1409.SuspensionBridge());
    }

    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());

    }
}

