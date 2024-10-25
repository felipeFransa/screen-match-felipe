package br.com.felipe.screenMatch.main;

import br.com.felipe.screenMatch.model.Movie;

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

        System.out.println("Enter your password:");
        String password = reading.nextLine();

        if (password.equals("nexttest")){
            System.out.println("list movie:");
            System.out.println(listMovies);
        }else {
            System.out.println("failed");
        }
    }
}
