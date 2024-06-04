package br.com.felipe.main;

import br.com.felipe.model.Movie;
import br.com.felipe.model.Serie;
import br.com.felipe.model.Title;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner movieTitleReading = new Scanner(System.in);
        System.out.println("enter your movie:");
        String movieTitle = movieTitleReading.nextLine();
        Title title = new Title();
        Movie movie = new Movie();
        Serie serie = new Serie();

        title.setTitleName(movieTitle);
        title.setTitleAge(2002);
        title.setTitleNote(9.0);

        movie.setMovieDuration(180);
        movie.setTitleName("Nemo");

        Title newTitle = new Title();
        newTitle.setTitleName("Avater");
        newTitle.setTitleAge(2022);
        newTitle.setTitleNote(8.5);

        System.out.println(title.getTitleName());
        System.out.println(title.getTitleAge());
        System.out.println(title.getTitleNote());

        System.out.println("Meu filme: " +newTitle.getTitleName());
        System.out.println("Ano de lancamento: " +newTitle.getTitleAge());
    }
}
