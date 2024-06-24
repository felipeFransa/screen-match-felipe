package br.com.felipe.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello welcome!");
        Scanner reading = new Scanner(System.in);
        System.out.println("Digite 1 ou 0;");
        Integer opcion = reading.nextInt();

        if (opcion > 0) {
            System.out.println("Seja bem vindo:");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
