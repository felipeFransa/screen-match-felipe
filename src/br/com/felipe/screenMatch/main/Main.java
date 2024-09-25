package br.com.felipe.screenMatch.main;

import br.com.felipe.screenMatch.model.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello welcome!");
        Scanner reading = new Scanner(System.in);
        User user = new User();

        System.out.println("Enter your name: ");
        String name = reading.nextLine();
        user.setFirstName(name);
        user.setTypeFlat("Plus");

        String verification = user.getTypeFlat();

        if ( verification.equals("Plus")) {
            System.out.println("Seja bem vindo:");
            System.out.println(user.getFirstName());
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
