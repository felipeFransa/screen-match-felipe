package br.com.felipe.main;

import br.com.felipe.model.Title;

import java.util.Scanner;

public class MainTitle {

    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Enter your title");
        String titleName = reading.nextLine();

        System.out.println("Enter your age title");
        Integer titleAge = reading.nextInt();

        Title title = new Title();
        title.setTitleName(titleName);
        title.setTitleAge(titleAge);
    }
}
