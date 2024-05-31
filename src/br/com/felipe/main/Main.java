package br.com.felipe.main;

import br.com.felipe.model.Movie;
import br.com.felipe.model.Serie;
import br.com.felipe.model.Title;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Title title = new Title();
        Movie movie = new Movie();
        Serie serie = new Serie();

        title.setTitleName("Harry Potter");
        title.setTitleAge(2002);
        title.setTitleNote(9.0);

        System.out.println(movie);
    }
}
