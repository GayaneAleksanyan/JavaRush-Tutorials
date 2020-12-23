package com.company;

public class StackLog {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        String b = Thread.currentThread().getStackTrace()[2].getClassName();
        String a = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(b + ": " + a + ": " + text);
    }
}
