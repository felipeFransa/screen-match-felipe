package br.com.felipe.main;

import br.com.felipe.model.ApiMovie;
import br.com.felipe.model.Movie;
import br.com.felipe.model.Serie;
import br.com.felipe.model.Title;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ApiMovie http = new ApiMovie();
        http.setHttp("https://www.omdbapi.com/?i=tt3896198&apikey=3f9c31bf");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(http.getHttp()))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Scanner movieTitleReading = new Scanner(System.in);
        System.out.println("enter your movie:");
        String movieTitle = movieTitleReading.nextLine();
        Title title = new Title();
        Movie movie = new Movie();
        Serie serie = new Serie();

        title.setTitleName(movieTitle);
        title.setTitleAge(2002);
        title.setTitleNote(9.0);

        movie.setTitleDuration(180);
        movie.setTitleName("Nemo");

        Title newTitle = new Title();
        newTitle.setTitleName("Avater");
        newTitle.setTitleAge(2022);
        newTitle.setTitleNote(8.5);

        Serie newSerie =new Serie();
        newSerie.setTitleName("Supernatural");
        newSerie.setTitleAge(2002);
        newSerie.setTitleSeason(15);

        System.out.println(title.getTitleName());
        System.out.println(title.getTitleAge());
        System.out.println(title.getTitleNote());

        System.out.println("Meu filme: " +newTitle.getTitleName());
        System.out.println("Ano de lancamento: " +newTitle.getTitleAge());
    }
}
