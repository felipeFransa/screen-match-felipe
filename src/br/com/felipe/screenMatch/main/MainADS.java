package br.com.felipe.screenMatch.main;

import br.com.felipe.screenMatch.model.ADS;

public class MainADS {
    public static void main(String[] args) {
        ADS ads = new ADS();

        ads.setDescriptionADS("");
        ads.setDescriptionADS("");

        System.out.println(ads.getTitleADS());
        System.out.println(ads.getDescriptionADS());
    }
}
