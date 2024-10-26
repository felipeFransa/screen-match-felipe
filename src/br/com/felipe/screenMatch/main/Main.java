package br.com.felipe.screenMatch.main;

import br.com.felipe.screenMatch.model.ApiMovie;
import br.com.felipe.screenMatch.model.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello welcome!");
        Scanner reading = new Scanner(System.in);
        User user = new User();
        ApiMovie api = new ApiMovie();

        System.out.println("Enter your name: ");
        String name = reading.nextLine();
        user.setFirstName(name);
        user.setTypeFlat("Plus");

        String verification = user.getTypeFlat();

        if ( verification.equals("Plus")) {
            System.out.println("Welcome ");
            System.out.println(user.getFirstName());
        } else {
            System.out.println("Access denied!");
        }
    }
}
