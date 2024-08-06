package br.com.felipe.screenMatch.model;

public class Title {

    private String titleName;
    private int titleAge;
    private String titleDescription;
    private double titleNote;

    public void titleShow(){
        System.out.println(getTitleName()+ " your movie age " + getTitleAge());
    }

    public String getTitleDescription() {
        return titleDescription;
    }

    public void setTitleDescription(String titleDescription) {
        this.titleDescription = titleDescription;
    }

    public double getTitleNote() {
        return titleNote;
    }

    public void setTitleNote(double titleNote) {
        this.titleNote = titleNote;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public double getTitleAge() {
        return titleAge;
    }

    public void setTitleAge(int titleAge) {
        this.titleAge = titleAge;
    }
}
