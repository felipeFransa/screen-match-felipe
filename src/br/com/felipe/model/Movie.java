package br.com.felipe.model;

public class Movie extends Title {
    private double movieDuration;

    public double getMovieDuration() {
        return movieDuration;
    }
    public void setMovieDuration(double movieDuration) {
        this.movieDuration = movieDuration;
    }
}
