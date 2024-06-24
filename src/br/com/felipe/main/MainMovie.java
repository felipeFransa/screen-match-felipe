package br.com.felipe.main;

import br.com.felipe.model.Movie;

import java.util.Scanner;

public class MainMovie {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("enter your movie:");
        String movie = reading.nextLine();

        Movie newMovie = new Movie();
        newMovie.setTitleName(movie);
        newMovie.setTitleDuration(180);
        newMovie.setTitleAge(2003);
        newMovie.setTitleNote(10);

        System.out.println(newMovie.getTitleName());
    }
}
