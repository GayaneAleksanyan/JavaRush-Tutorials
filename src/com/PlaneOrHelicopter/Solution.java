package com.PlaneOrHelicopter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {
    }

    static {
        reset();
    }

    public static com.PlaneOrHelicopter.CanFly result;

    public static void reset() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            if (s.equals("helicopter")) {
                result = new com.PlaneOrHelicopter.Helicopter();
            } else if (s.equals("plane")) {
                result = new com.PlaneOrHelicopter.Plane(100);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
