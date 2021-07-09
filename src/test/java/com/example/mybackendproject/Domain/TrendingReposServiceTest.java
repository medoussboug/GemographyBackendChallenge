package com.example.mybackendproject.Domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TrendingReposServiceTest {

    private GithubClient client = mock(GithubClient.class);
    private TrendingReposMapper trendingReposMapper = mock(TrendingReposMapper.class);
    private TrendingReposService trendingReposService = new TrendingReposService(client, trendingReposMapper);

    @Test
    void mapLanguagesTrendingReposDTO_whenGithubRequestSucceed_thenMapResponseToLanguagesTrendingReposDTO() {
        List<TrendingReposDTO.Item> items = new ArrayList<>();
        items.add(new TrendingReposDTO.Item(1234, "AutoIt"));
        TrendingReposDTO trendingReposDTO = new TrendingReposDTO(21, false, items);
        when(client.getTrendingReposDTO()).thenReturn(trendingReposDTO);
        List<Integer> id = new ArrayList<>();
        id.add(3800);
        List<LanguagesTrendingReposDTO.LanguageTrendingReposDTO> languageTrendingReposDTOS = new ArrayList<>();
        languageTrendingReposDTOS.add(new LanguagesTrendingReposDTO.LanguageTrendingReposDTO("AutoIt", 1, id));
        LanguagesTrendingReposDTO languagesTrendingReposDTOExpected = new LanguagesTrendingReposDTO(languageTrendingReposDTOS);
        when(trendingReposMapper.map(trendingReposDTO)).thenReturn(languagesTrendingReposDTOExpected);
        LanguagesTrendingReposDTO languagesTrendingReposDTOActual = trendingReposService.mapLanguagesTrendingReposDTO();
        assertEquals(languagesTrendingReposDTOExpected.languageTrendingReposDTOS.get(0).repos, languagesTrendingReposDTOActual.languageTrendingReposDTOS.get(0).repos);
    }
}