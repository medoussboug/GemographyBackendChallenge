package com.example.mybackendproject.Domain;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrendingReposService {

    @Autowired
    private GithubClient client;

    public TrendingReposService(GithubClient client) {
        this.client = client;
    }

    public TrendingReposDTO mapDTO() {
        Gson gson = new Gson();
        return gson.fromJson(performRequest(), TrendingReposDTO.class);
    }
    private String performRequest() {
        return client.performRequest();
    }
}
