package com.company;

public class HumanConstructor {
    public static void main(String[] args) {
        Human number1 = new Human("Василий", true,63);
        Human number2 = new Human("Алиса", false, 59);
        Human number3 = new Human("Генадий", true, 70);
        Human number4 = new Human("Алла", false, 65);

        Human number5 = new Human("Антон", true, 35, number1, number2);
        Human number6 = new Human("Мария", false, 30, number3, number4);

        Human number7 = new Human("Катя", false, 11, number5, number6);
        Human number8 = new Human("Дима", true, 8, number5, number6);
        Human number9 = new Human("Макс", true, 5, number5, number6);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
        System.out.println(number7);
        System.out.println(number8);
        System.out.println(number9);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
