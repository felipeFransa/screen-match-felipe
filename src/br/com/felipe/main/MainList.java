package br.com.felipe.main;

import br.com.felipe.model.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class MainList {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        System.out.println("Enter your movie:");
        String movie = reading.nextLine();
        Movie myMovie = new Movie();
        Movie movie1 = new Movie();

        movie1.setTitleName("Avatar");

        myMovie.setTitleName(movie);
        ArrayList<Movie> listMovies = new ArrayList<>();

        listMovies.add(myMovie);
        listMovies.add(movie1);

        System.out.println(listMovies);
    }
}
