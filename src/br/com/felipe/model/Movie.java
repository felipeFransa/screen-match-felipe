package br.com.felipe.model;

public class Movie extends Title {
    private int titleDuration;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public int getTitleDuration() {
        return titleDuration;
    }

    public void setTitleDuration(int titleDuration) {
        this.titleDuration = titleDuration;
    }
}
