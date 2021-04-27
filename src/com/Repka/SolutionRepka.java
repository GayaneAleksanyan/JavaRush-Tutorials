package com.Repka;

import java.util.ArrayList;
import java.util.List;
import java.lang.RuntimeException;

/* 
Репка
*/

public class SolutionRepka {
    public static void main(String[] args) {
        List<com.Repka.Person> plot = new ArrayList<>();
        plot.add(new com.Repka.Person("Репка", "Репку"));
        plot.add(new com.Repka.Person("Дедка", "Дедку"));
        plot.add(new com.Repka.Person("Бабка", "Бабку"));
        plot.add(new com.Repka.Person("Внучка", "Внучку"));
        com.Repka.RepkaStory.tell(plot);
    }
}
