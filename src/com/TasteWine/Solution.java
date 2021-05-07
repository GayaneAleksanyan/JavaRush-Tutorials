package com.TasteWine;

/* 
Дегустация вин
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static com.TasteWine.Drink getDeliciousDrink() {
        return new com.TasteWine.Wine();
    }

    public static com.TasteWine.Wine getWine() {
        return new com.TasteWine.Wine();
    }

    public static com.TasteWine.Wine getBubblyWine() {
        return new com.TasteWine.BubblyWine();
    }
}
