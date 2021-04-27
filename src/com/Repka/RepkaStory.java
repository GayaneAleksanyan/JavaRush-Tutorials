package com.Repka;

import java.util.List;

public class RepkaStory {
    static void tell(List<com.Repka.Person> items) {
        com.Repka.Person first;
        com.Repka.Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i - 1);
            second = items.get(i);
            second.pull(first);
        }
    }
}
