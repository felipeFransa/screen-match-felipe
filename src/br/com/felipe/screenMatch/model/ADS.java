package br.com.felipe.screenMatch.model;

public class ADS {
    private String titleADS;
    private String descriptionADS;
    private Boolean toCheck;

    public Boolean getToCheck() {
        return toCheck;
    }

    public void setToCheck(Boolean toCheck) {
        this.toCheck = toCheck;
    }


    public String getTitleADS() {
        return titleADS;
    }

    public void setTitleADS(String titleADS) {
        this.titleADS = titleADS;
    }

    public String getDescriptionADS() {
        return descriptionADS;
    }

    public void setDescriptionADS(String descriptionADS) {
        this.descriptionADS = descriptionADS;
    }
}
