package br.com.felipe.main;

import br.com.felipe.model.User;

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

        System.out.println(user.getFirstName());

        String verification = user.getTypeFlat();

        if ( verification.equals("Plus")) {
            System.out.println("Seja bem vindo:");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
