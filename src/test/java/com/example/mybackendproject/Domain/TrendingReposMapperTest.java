package com.example.mybackendproject.Domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrendingReposMapperTest {

    private TrendingReposMapper trendingReposMapper = new TrendingReposMapper();

    @Test
    void map_WhenGettingTrendingReposDTO_ThenMapDataToLanguagesTrendingReposDTO() {
        List<TrendingReposDTO.Item> items = new ArrayList<>();
        items.add(new TrendingReposDTO.Item(1234, "C"));
        items.add(new TrendingReposDTO.Item(124, "C"));
        items.add(new TrendingReposDTO.Item(134, "Java"));
        TrendingReposDTO trendingReposDTO = new TrendingReposDTO(39, false, items);
        List<LanguagesTrendingReposDTO.LanguageTrendingReposDTO> trendingReposResponses = new ArrayList<>();
        List<Integer> ids1 = new ArrayList<>();
        ids1.add(1234);
        ids1.add(124);
        trendingReposResponses.add(new LanguagesTrendingReposDTO.LanguageTrendingReposDTO("C", 2, ids1));
        List<Integer> ids2 = new ArrayList<>();
        ids2.add(134);
        trendingReposResponses.add(new LanguagesTrendingReposDTO.LanguageTrendingReposDTO("Java", 1, ids2));
        LanguagesTrendingReposDTO trendingReposResponsesExpected = new LanguagesTrendingReposDTO(trendingReposResponses);
        LanguagesTrendingReposDTO trendingReposResponsesActual = trendingReposMapper.map(trendingReposDTO);
        assertEquals(trendingReposResponsesExpected.languageTrendingReposDTOs.get(1).repos, trendingReposResponsesActual.languageTrendingReposDTOs.get(0).repos);
    }
}