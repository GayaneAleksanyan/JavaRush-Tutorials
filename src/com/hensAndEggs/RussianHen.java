package com.hensAndEggs;

public class RussianHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + ("Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
