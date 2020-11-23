package com.company;

public class Cat {
        public int age;
        public int weight;
        public int strength;

        public Cat() {
        }

        public boolean fight(Cat anotherCat) {
            int thisCatPoints = 0;
            int anotherCatPoints = 0;

            if (this.weight > anotherCat.weight) {
                thisCatPoints++;
            } else if (this.weight < anotherCat.weight) {
                anotherCatPoints++;
            }
            if (this.age > anotherCat.age) {
                thisCatPoints++;
            } else if (this.age < anotherCat.age) {
                anotherCatPoints++;
            }
            if (this.strength > anotherCat.strength) {
                thisCatPoints++;
            } else if (this.strength < anotherCat.strength) {
                anotherCatPoints++;
            }
            return (thisCatPoints > anotherCatPoints || (thisCatPoints == anotherCatPoints && this.hashCode() > anotherCat.hashCode()));

        }

        public static void main(String[] args) {
            Cat cat1 = new Cat();
            Cat cat2 = new Cat();
            cat1.weight = 3;
            cat1.age = 4;
            cat1.strength = 12;
            cat2.weight = 4;
            cat2.age = 4;
            cat2.strength = 12;
            System.out.println(cat1.fight(cat2));
            System.out.println(cat2.fight(cat1));
        }
}
