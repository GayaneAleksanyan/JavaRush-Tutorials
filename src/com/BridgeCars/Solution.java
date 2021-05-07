package com.BridgeCars;

/* 
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new com.BridgeCars.WaterBridge());
        println(new com.BridgeCars.SuspensionBridge());
    }

    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());

    }
}

