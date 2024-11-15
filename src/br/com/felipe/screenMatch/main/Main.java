package br.com.felipe.screenMatch.main;

import br.com.felipe.screenMatch.model.ApiMovie;
import br.com.felipe.screenMatch.model.User;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello welcome!");
        Scanner reading = new Scanner(System.in);
        User user = new User();
        ApiMovie api = new ApiMovie();
        LocalTime myTime = LocalTime.now();
        LocalDate myDate = LocalDate.now();

        System.out.println("Enter your name: ");
        String name = reading.nextLine();
        user.setFirstName(name);

        System.out.println("Enter your typeFlat");
        String typeFlat = reading.nextLine();
        user.setTypeFlat(typeFlat);

        String verification = user.getTypeFlat();

        if ( verification.equals("Plus")) {
            System.out.println("Welcome ");
            System.out.println(user.getFirstName());
            System.out.println(myDate + " or " + myTime);
            System.out.println("Welcome bank 333");
        } else {
            System.out.println("Access denied!");
        }
    }
}
