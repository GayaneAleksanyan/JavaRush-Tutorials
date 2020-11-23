package com.company;

public class Catt {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Catt.setCatsCount(Catt.catsCount);

    }

    public static void main(String[] args) {

    }

    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
    }

}
