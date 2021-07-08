package com.example.mybackendproject.Domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrendingReposMapperTest {

    private TrendingReposMapper trendingReposMapper = new TrendingReposMapper();

    @Test
    void map_WhenGettingTrendingReposDTO_ThenMapDataToLanguagesTrendingReposDTO() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1234, null,null,null,false,null,null,null,false,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, "C",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null));
        items.add(new Item(124, null,null,null,false,null,null,null,false,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, "C",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null));
        items.add(new Item(134, null,null,null,false,null,null,null,false,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null, "Java",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null));
        TrendingReposDTO trendingReposDTO = new TrendingReposDTO(39, false, items);
        List<LanguageTrendingReposDTO> trendingReposResponses = new ArrayList<>();
        List<Integer> ids1 = new ArrayList<>();
        ids1.add(1234);
        ids1.add(124);
        trendingReposResponses.add(new LanguageTrendingReposDTO("C", 2, ids1));
        List<Integer> ids2 = new ArrayList<>();
        ids2.add(134);
        trendingReposResponses.add(new LanguageTrendingReposDTO("Java", 1, ids2));
        LanguagesTrendingReposDTO trendingReposResponsesExpected = new LanguagesTrendingReposDTO(trendingReposResponses);
        LanguagesTrendingReposDTO trendingReposResponsesActual = trendingReposMapper.map(trendingReposDTO);
        assertEquals(trendingReposResponsesExpected.languageTrendingReposDTOS.get(1).repos, trendingReposResponsesActual.languageTrendingReposDTOS.get(0).repos);
    }
}