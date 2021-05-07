package com.HensAndEggs;

public class UkrainianHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + ("Моя страна - " + UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
