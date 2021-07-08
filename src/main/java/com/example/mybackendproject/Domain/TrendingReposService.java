package com.example.mybackendproject.Domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrendingReposService {

    @Autowired
    private GithubClient client;

    public TrendingReposService(GithubClient client) {
        this.client = client;
    }

    public String performRequest() {
        return client.performRequest();
    }
}
