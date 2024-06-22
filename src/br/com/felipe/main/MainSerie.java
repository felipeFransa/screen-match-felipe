package br.com.felipe.main;

import br.com.felipe.model.Serie;

import java.util.Scanner;

public class MainSerie {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        Serie serie = new Serie();
        System.out.println("enter your TV Show:");
        String tvShow = reading.nextLine();

        serie.setTitleName(tvShow);

        System.out.println("your " +serie.getTitleName());
    }
}
