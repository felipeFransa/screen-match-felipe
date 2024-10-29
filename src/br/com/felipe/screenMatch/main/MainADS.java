package br.com.felipe.screenMatch.main;

import br.com.felipe.screenMatch.model.ADS;

import java.time.LocalDate;
import java.util.Scanner;

public class MainADS {
    public static void main(String[] args) {

        LocalDate myDate = LocalDate.now();
        ADS ads = new ADS();
        Scanner reading = new Scanner(System.in);
        System.out.println("enter your title:");
        String titleADS = reading.nextLine();
        ads.setTitleADS(titleADS);

        System.out.println("enter your description:");
        String descriptionADS = reading.next();
        ads.setDescriptionADS(descriptionADS);

        ads.setToCheck(true);

        if (ads.getToCheck()){
            System.out.println(ads.getTitleADS());
            System.out.println(ads.getDescriptionADS());
        }else {
            System.out.println("failed");
        }
    }
}