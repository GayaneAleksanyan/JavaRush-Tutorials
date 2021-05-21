package com.Movie;

/*
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        Movie movie = null;

        label:
        while (true) {
            key = reader.readLine();

            switch (key) {
                case "soapOpera":
                    movie = MovieFactory.getMovie(key);
                    System.out.println(movie.getClass().getSimpleName());
                    break;
                case "cartoon":
                    movie = MovieFactory.getMovie(key);
                    System.out.println(movie.getClass().getSimpleName());
                    break;
                case "thriller":
                    movie = MovieFactory.getMovie(key);
                    System.out.println(movie.getClass().getSimpleName());
                    break;
                default:
                    MovieFactory.getMovie(key);
                    break label;
            }

        }


    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
