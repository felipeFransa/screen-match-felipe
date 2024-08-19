package br.com.felipe.screenMatch.main;

import br.com.felipe.screenMatch.model.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainMovie {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("enter plan");
        String plan = reading.nextLine();

        ArrayList<String> movies = new ArrayList<String>();
        movies.add("Avatar");
        movies.add("Harry potter");
        movies.add("Procurando o nemo");

        Collections.sort(movies);

        for (String i : movies) {
            System.out.println(i);
        }

        Movie newMovie = new Movie();
        newMovie.setTitleName("dracula");
        newMovie.setTitleDuration(180);
        newMovie.setTitleAge(2003);
        newMovie.setTitleNote(10);
        newMovie.setDescription("""
                Filme lancado no ano:
                """+newMovie.getTitleAge());

       if (plan.equals("plus")){
           System.out.println(newMovie.getTitleName());
       }else {
           System.out.println("failed");
       }
    }
}
