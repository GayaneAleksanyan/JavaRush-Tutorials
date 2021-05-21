package com.cat;

/* 
Статики и котики
*/

public class Solution {

    public static class Cat {
        public String name;
    }

    public static Cat cat;
    static {
        cat = new Cat();
        cat.name = "Murka";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }
}
