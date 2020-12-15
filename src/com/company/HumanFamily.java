package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class HumanFamily {
    public static void main(String[] args) {
        Human son1 = new Human("Kostya", true, 12);
        Human son2 = new Human("Denis", true, 9);
        Human daughter = new Human("Alisa", false, 5);
        Human father = new Human("Oleg", true, 36, son1, son2, daughter);
        Human mother = new Human("Masha", false, 30, son1, son2, daughter);
        Human grandfather1 = new Human("Vasiliy", true, 56, father);
        Human grandfather2 = new Human("Dmitriy", true, 62, mother);
        Human grandmother1 = new Human("Katya", false, 52, father);
        Human grandmother2 = new Human("Olya", false, 50, mother);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human {
        String name;
        Boolean sex;
        int age;
        java.util.ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
