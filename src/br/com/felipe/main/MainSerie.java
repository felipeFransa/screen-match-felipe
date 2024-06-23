package br.com.felipe.main;

import br.com.felipe.model.Serie;

import java.util.Scanner;

public class MainSerie {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        Serie serie = new Serie();
        System.out.println("enter your TV Show:");
        String tvShow = reading.nextLine();

        serie.setTitleName("Supernatural");
        serie.setTitleAge(2002);
        serie.setTitleSeason(15);
        serie.setTitleDescription("Supernatural foi uma série de televisão estadunidense de fantasia sombria e urbana criada por Eric Kripke");

        System.out.println("your " +serie.getTitleName());
        System.out.println(serie.getTitleAge());
        System.out.println(serie.getTitleSeason());
        System.out.println(serie.getTitleDescription());
    }
}
