package com.company;

public class Circle1 {
    public Color color;

    public static void main(String[] args) {
        Circle1 circle = new Circle1();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public Circle1() {
        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
