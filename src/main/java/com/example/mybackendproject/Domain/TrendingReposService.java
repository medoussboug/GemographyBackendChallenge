package com.example.mybackendproject.Domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrendingReposService {

    private final GithubClient client;
    private final TrendingReposMapper trendingReposMapper;

    @Autowired
    public TrendingReposService(GithubClient client, TrendingReposMapper trendingReposMapper) {
        this.client = client;
        this.trendingReposMapper = trendingReposMapper;
    }

    public LanguagesTrendingReposDTO mapLanguagesTrendingReposDTO() {
        TrendingReposDTO reposList = client.getTrendingRepos();
        return trendingReposMapper.map(reposList);
    }
}
