package com.company;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class MultipleCatchException {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (java.lang.NullPointerException | FileNotFoundException e) {
        }
    }

    public static void method1() throws java.lang.NullPointerException, java.lang.ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new java.lang.NullPointerException();
        } else if (i == 1) {
            throw new java.lang.ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}
