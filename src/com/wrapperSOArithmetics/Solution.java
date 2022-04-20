package com.wrapperSOArithmetics;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        System.setOut(consoleStream);

        String result = outputStream.toString();
        String[] resultArray =result.split(" ");
        int first = Integer.parseInt(resultArray[0]);
        int second = Integer.parseInt(resultArray[2]);
        int finalResult;

        if (resultArray[1].trim().equals("+")) {
            finalResult = first + second;
        } else if (resultArray[1].trim().equals("-")) {
            finalResult = first - second;
        } else {
            finalResult = first * second;
        }

        System.out.println(first + " " + resultArray[1] + " " + second + " = " + finalResult);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

