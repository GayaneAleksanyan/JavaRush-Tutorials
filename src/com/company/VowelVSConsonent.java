package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VowelVSConsonent {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static char[] consonants = new char[]{
            'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ь',
            '.', ',', ';', ':', '!', '?', '-', '«', '»', '(', ')'
    };

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        char[] chars = string.toCharArray();

        java.util.ArrayList<Character> vowel = new java.util.ArrayList<>();
        java.util.ArrayList<Character> notVowel  = new ArrayList<>();

        for (char bukva : chars) {
            if (isVowel(bukva)) {
                vowel.add(bukva);
            } else if (isConsonant(bukva)) {
                notVowel.add(bukva);
            }
        }

        String a = "";
        String b = "";

        for (char c : vowel) {
            a += c + " ";
        }
        for (char d : notVowel) {
            b += d + " ";
        }
        System.out.println(a);
        System.out.println(b);
    }


    // метод проверяет, гласная ли буква
    public static boolean isConsonant(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char consonant : consonants) {  // ищем среди массива гласных
            if (character == consonant) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
