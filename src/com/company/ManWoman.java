package com.company;

public class ManWoman {
        public static void main(String[] args) {
            Man man1 = new Man("Oleg", 22, "kkkkkkk");
            Man man2 = new Man("Kolya", 5, "pppp");

            System.out.println(man1.name + " " + man1.age + " " + man1.address);
            System.out.println(man2.name + " " + man2.age + " " + man2.address);

            Woman woman1 = new Woman("Katya", 18, "lllll");
            Woman woman2 = new Woman("Olya", 3, "zzzz");

            System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
            System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
        }

        public static class Man {
            String name;
            int age;
            String address;

            public Man(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }
        }

        public static class Woman {
            String name;
            int age;
            String address;

            public Woman(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }

        }
    }
