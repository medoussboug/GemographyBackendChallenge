package com.example.mybackendproject.Domain;

import java.util.List;

public class LanguagesTrendingReposDTO {
    public final List<LanguageTrendingReposDTO> languageTrendingReposDTOS;

    public LanguagesTrendingReposDTO(List<LanguageTrendingReposDTO> languageTrendingReposDTOS) {
        this.languageTrendingReposDTOS = languageTrendingReposDTOS;
    }
}
