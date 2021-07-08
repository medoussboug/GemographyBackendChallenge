package com.example.mybackendproject.Domain;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;

@Component
public class GithubClient {
    private HttpClient httpClient;
    private HttpRequest httpRequest;

    public GithubClient() {
        httpClient = HttpClient.newHttpClient();
        httpRequest = HttpRequest.newBuilder(URI.create("https://api.github.com/search/repositories?q=created:%3E" + LocalDate.now().minusDays(30) + "&per_page=100&sort=stars&order=desc")).build();
    }

    public GithubClient(HttpClient httpClient, HttpRequest httpRequest) {
        this.httpClient = httpClient;
        this.httpRequest = httpRequest;
    }

    public GithubClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        httpRequest = HttpRequest.newBuilder(URI.create("https://api.github.com/search/repositories?q=created:%3E" + LocalDate.now().minusDays(30) + "&per_page=100&sort=stars&order=desc")).build();
    }

    TrendingReposDTO getTrendingReposDTO() {
        Gson gson = new Gson();
        return gson.fromJson(performRequest(), TrendingReposDTO.class);
    }

    private String performRequest() {
        try {
            return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString()).body();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "error when performing the request";
    }
}
