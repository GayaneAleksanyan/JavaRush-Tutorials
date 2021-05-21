package com.repka;

import java.util.ArrayList;
import java.util.List;

/* 
Репка
*/

public class SolutionRepka {
    public static void main(String[] args) {
        List<com.repka.Person> plot = new ArrayList<>();
        plot.add(new com.repka.Person("Репка", "Репку"));
        plot.add(new com.repka.Person("Дедка", "Дедку"));
        plot.add(new com.repka.Person("Бабка", "Бабку"));
        plot.add(new com.repka.Person("Внучка", "Внучку"));
        com.repka.RepkaStory.tell(plot);
    }
}
