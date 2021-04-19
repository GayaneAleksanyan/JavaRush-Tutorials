package com.company;

public class InterfacePersonIsAlive {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        static boolean isAlive() {
            return false;
        }
    }

    interface Presentable extends Person {

    }
}
