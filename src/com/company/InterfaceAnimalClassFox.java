package com.company;

import java.awt.*;

public class InterfaceAnimalClassFox {public static void main(String[] args) throws Exception {
}

    public interface Animal {
        default Color getColor() {
            return null;
        }

        default Integer getAge() {
            return null;
        }
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }

    }
}
