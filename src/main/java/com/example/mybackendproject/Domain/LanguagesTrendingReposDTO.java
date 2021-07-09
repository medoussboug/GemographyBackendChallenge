package com.example.mybackendproject.Domain;

import java.util.List;

public class LanguagesTrendingReposDTO {
    public final List<LanguageTrendingReposDTO> languageTrendingReposDTOs;

    public LanguagesTrendingReposDTO(List<LanguageTrendingReposDTO> languageTrendingReposDTOs) {
        this.languageTrendingReposDTOs = languageTrendingReposDTOs;
    }

    public static class LanguageTrendingReposDTO {
        public final String language;
        public final Integer numberOfUsage;
        public final List<Integer> repos;

        public LanguageTrendingReposDTO(String language, Integer numberOfUsage, List<Integer> repos) {
            this.language = language;
            this.numberOfUsage = numberOfUsage;
            this.repos = repos;
        }
    }
}
