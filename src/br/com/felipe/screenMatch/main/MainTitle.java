package br.com.felipe.screenMatch.main;

import br.com.felipe.screenMatch.model.Title;

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
        title.titleShow();

        System.out.println(title.getTitleName());
        System.out.println(title.getTitleAge());
    }
}
