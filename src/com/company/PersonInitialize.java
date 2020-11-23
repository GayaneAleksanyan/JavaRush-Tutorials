package com.company;

public class PersonInitialize {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Oleg", 22);
    }

    static class Person {
        String name;
        int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
