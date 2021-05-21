package com.bridgeCars;

/* 
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new com.bridgeCars.WaterBridge());
        println(new com.bridgeCars.SuspensionBridge());
    }

    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());

    }
}

