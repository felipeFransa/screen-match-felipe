package br.com.felipe.screenMatch.model;

public class Serie extends Title {

    private int titleSeason;

    private boolean toCheck;

    public boolean isToCheck() {
        return toCheck;
    }

    public void setToCheck(boolean toCheck) {
        this.toCheck = toCheck;
    }

    public int getTitleSeason() {
        return titleSeason;
    }

    public void setTitleSeason(int titleSeason) {
        this.titleSeason = titleSeason;
    }
}
