package com.tasteWine;

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

    public static com.tasteWine.Drink getDeliciousDrink() {
        return new com.tasteWine.Wine();
    }

    public static com.tasteWine.Wine getWine() {
        return new com.tasteWine.Wine();
    }

    public static com.tasteWine.Wine getBubblyWine() {
        return new com.tasteWine.BubblyWine();
    }
}
