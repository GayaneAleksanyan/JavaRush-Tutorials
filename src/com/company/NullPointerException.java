package com.company;

public class NullPointerException {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (java.lang.NullPointerException e) {
            System.out.println(e);
        }
    }
}
