package com.company;

public class Smile {
    public static void main(String[] args) {
        int smile = 0x1F600; // Здесь шестнадцатеричный код эмоджи
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toChars(smile)); // Собираем в StringBuilder
        System.out.println("Улыбающееся лицо: " + sb.toString()); // Выводим
    }
}
