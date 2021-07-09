package com.example.mybackendproject.Domain;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;

@Component
public class GithubClient {
    private static final LocalDate THIRTY_DAY = LocalDate.now().minusDays(30);
    private static final String URL = "https://api.github.com/search/repositories?q=created:%3E" + THIRTY_DAY + "&per_page=100&sort=stars&order=desc";
    private final HttpClient httpClient;
    private final HttpRequest httpRequest;
    private final Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create();

    GithubClient() {
        httpClient = HttpClient.newHttpClient();
        httpRequest = HttpRequest.newBuilder(URI.create(URL)).build();
    }

    GithubClient(HttpClient httpClient, HttpRequest httpRequest) {
        this.httpClient = httpClient;
        this.httpRequest = httpRequest;
    }

    TrendingReposDTO getTrendingRepos() {
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
        return null;
    }
}
