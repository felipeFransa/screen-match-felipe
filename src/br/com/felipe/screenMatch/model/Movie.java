package br.com.felipe.screenMatch.model;

public class Movie extends Title {
    private int titleDuration;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTitleDuration() {
        return titleDuration;
    }

    public void setTitleDuration(int titleDuration) {
        this.titleDuration = titleDuration;
    }
}
