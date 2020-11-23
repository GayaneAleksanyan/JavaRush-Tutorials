package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatParents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat momParent;
        private Cat dadParent;

        Cat(String name, Cat momParent, Cat dadParent) {
            this.name = name;
            this.momParent = momParent;
            this.dadParent = dadParent;
        }


        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            if (dadParent == null && momParent == null) {
                return "The cat's name is " + name + ", no mother, no father";
            } else if (momParent == null) {
                return "The cat's name is " + name + ", no mother, " + "father is " + dadParent.name;
            } else if (dadParent == null) {
                return "The cat's name is " + name + ", mother is " + momParent.name + ", no father";
            } else {
                return "The cat's name is " + name + ", mother is " + momParent.name + " father is " + dadParent.name;
            }
        }
    }
}
