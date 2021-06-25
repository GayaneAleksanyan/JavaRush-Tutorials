package com.object;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Solution object = new Solution();

        System.out.println(object.intVar);
        System.out.println(object.doubleVar);
        System.out.println(object.DoubleVar);
        System.out.println(object.booleanVar);
        System.out.println(object.ObjectVar);
        System.out.println(object.ExceptionVar);
        System.out.println(object.StringVar);
    }

}
