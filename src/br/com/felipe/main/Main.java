package br.com.felipe.main;

import br.com.felipe.model.Movie;
import br.com.felipe.model.Serie;
import br.com.felipe.model.Title;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        Movie movie = new Movie();
        Title title = new Title();
        Serie serie = new Serie();
        System.out.println("Digite seu filme:");
        String movieReading = reading.nextLine();
        System.out.println("Olá");
        System.out.println("Seu filme: " +movie);
    }
}
