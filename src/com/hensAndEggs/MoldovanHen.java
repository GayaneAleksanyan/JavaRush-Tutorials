package com.hensAndEggs;

public class MoldovanHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + ("Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
