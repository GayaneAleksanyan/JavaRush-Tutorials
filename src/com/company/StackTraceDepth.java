package com.company;

public class StackTraceDepth {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        int a = Thread.currentThread().getStackTrace().length;
        System.out.println(a);
        return Thread.currentThread().getStackTrace().length;
    }
}
