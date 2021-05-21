package com.hensAndEggs;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();

        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            switch (country) {
                case Country.BELARUS:
                    hen = new BelarusianHen();
                    hen.getDescription();
                    break;
                case Country.RUSSIA:
                    hen = new RussianHen();
                    hen.getDescription();
                    break;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    hen.getDescription();
                    break;
                case Country.UKRAINE:
                    hen = new UkrainianHen();
                    hen.getDescription();
                    break;
            }
            return hen;
        }
    }
}
