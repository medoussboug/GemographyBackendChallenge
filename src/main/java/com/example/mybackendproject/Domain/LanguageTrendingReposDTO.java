package com.example.mybackendproject.Domain;

import java.util.List;

public class LanguageTrendingReposDTO {
    public final String name;
    public final Integer numberOfUsage;
    public final List<Integer> repos;

    public LanguageTrendingReposDTO(String name, Integer numberOfUsage, List<Integer> repos) {
        this.name = name;
        this.numberOfUsage = numberOfUsage;
        this.repos = repos;
    }
}
