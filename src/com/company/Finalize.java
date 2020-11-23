package com.company;

public class Finalize {
    public static void main(String[] args) {

        for(int i = 0; i < 50000; i++) {
            Cat cat = new Cat();
            cat = null;
        }

        for(int i = 0; i < 50000; i++) {
            Dog dog = new Dog();
            dog = null;
        }
    }
}

class Cat2 {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog2 {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
