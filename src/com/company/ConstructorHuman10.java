package com.company;

public class ConstructorHuman10 {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String sirname;
        private boolean sex;
        private int age;
        private String occupation;
        private String address;

        public Human(String name, String sirname) {
            this.name = name;
            this.sirname = sirname;
        }
        public Human (String name, String sirname, boolean sex) {
            this.name = name;
            this.sirname = sirname;
            this.sex = sex;
        }
        public Human (String name, String sirname, int age) {
            this.name = name;
            this.sirname = sirname;
            this.age = age;
        }
        public Human (String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human (String name, int age, String occupation) {
            this.name = name;
            this.age = age;
            this.occupation = occupation;
        }
        public Human (String name, String sirname, boolean sex, int age, String occupation, String address) {
            this.name = name;
            this.sirname = sirname;
            this.sex = sex;
            this.age = age;
            this.occupation = occupation;
            this.address = address;
        }
        public Human (String sirname, boolean sex, int age, String occupation, String address) {
            this.sirname = sirname;
            this.sex = sex;
            this.age = age;
            this.occupation = occupation;
            this.address = address;
        }
        public Human (String name, boolean sex, int age, String occupation) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.occupation = occupation;
        }
        public Human (String name, String sirname, String occupation, String address) {
            this.name = name;
            this.sirname = sirname;
            this.occupation = occupation;
            this.address = address;
        }
        public Human (String name, String address, int age, boolean sex) {
            this.name = name;
            this.address = address;
            this.age = age;
            this.sex = sex;
        }
    }
}
