package com.example.mybackendproject.Domain;

import java.util.List;

public class LanguageTrendingReposDTO {
    public final String name;
    public final Integer time_used;
    public final List<Integer> repos;

    public LanguageTrendingReposDTO(String name, Integer time_used, List<Integer> repos) {
        this.name = name;
        this.time_used = time_used;
        this.repos = repos;
    }
}
