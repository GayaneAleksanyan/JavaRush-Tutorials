package com.company;

public class Artifact {
    static int count = 0;
    String culture;
    int date;
    int number;

    public Artifact(int number) {
        this.number = number;
        count++;
    }

    public Artifact(int number, String culture) {
        this.number = number;
        this.culture = "Ацтеки";
        count++;
    }

    public Artifact(int number, String culture, int date) {
        this.number = number;
        this.culture = "Ацтеки";
        this.date = 13;
        count++;
    }

    public static void main(String[] args) {
        Artifact item1 = new Artifact(1);
        Artifact item2 = new Artifact(10, "Ацтеки");
        Artifact item3 = new Artifact(150, "Ацтеки", 13);
        System.out.println(item1.number);
        System.out.println(item2.number + " " + item2.culture);
        System.out.println(item3.number + " " + item3.culture + " " + item3.date);
        System.out.println("Всего предметов " + count);
    }
}
