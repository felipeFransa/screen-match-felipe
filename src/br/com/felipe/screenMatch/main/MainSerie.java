package br.com.felipe.screenMatch.main;

import br.com.felipe.screenMatch.model.Serie;

import java.util.Scanner;

public class MainSerie {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        Serie serie = new Serie();
        System.out.println("enter your TV Show:");
        String tvShow = reading.nextLine();

        Serie serie2 = new Serie();

        serie2.setTitleName("Friends");
        serie2.setTitleAge(1998);
        serie2.setTitleSeason(10);
        serie2.setTitleDescription("");
        serie2.setToCheck(true);

        serie.setTitleName(tvShow);
        serie.setTitleAge(2002);
        serie.setTitleSeason(15);
        serie.setTitleDescription("Supernatural foi uma série de televisão estadunidense de fantasia sombria e urbana criada por Eric Kripke");
        serie.setToCheck(true);

        if (serie.isToCheck()){
            System.out.println("your " +serie.getTitleName());
            System.out.println(serie.getTitleAge());
            System.out.println(serie.getTitleSeason());
            System.out.println(serie.getTitleDescription());
            if(serie2.isToCheck()){
                System.out.println(serie2.getTitleName());
                System.out.println(serie2.getTitleAge());
            }
        }else {
            System.out.println("failed");
        }
    }
}
