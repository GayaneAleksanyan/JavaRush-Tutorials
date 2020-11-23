package com.company;

public class IdeaGetDescription {
    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea {

        public String getDescription() {
            return "s";
        }
    }
}
