package com.example.mybackendproject.Domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class TrendingReposMapper {

    LanguagesTrendingReposDTO map(TrendingReposDTO trendingRepos) {
        List<String> trendingReposLanguages = getTrendingReposLanguages(trendingRepos);
        List<LanguagesTrendingReposDTO.LanguageTrendingReposDTO> trendingReposResponseDTOS = new ArrayList<>();
        for (String trendingReposLanguage : trendingReposLanguages) {
            trendingReposResponseDTOS.add(new LanguagesTrendingReposDTO.LanguageTrendingReposDTO(trendingReposLanguage, this.calculateNumberOfUsageOfLanguage(trendingReposLanguage, trendingRepos), this.mapIdsByLanguage(trendingReposLanguage, trendingRepos)));
        }
        return new LanguagesTrendingReposDTO(trendingReposResponseDTOS);
    }

    private List<String> getTrendingReposLanguages(TrendingReposDTO trendingRepos) {
        List<String> languagesList;
        Set<String> temp = new HashSet<>();
        trendingRepos.items.forEach(item -> temp.add(item.language));
        languagesList = new ArrayList<>(temp);
        languagesList.remove(null);
        return languagesList;
    }

    private Integer calculateNumberOfUsageOfLanguage(String language, TrendingReposDTO trendingRepos) {
        int count = 0;
        List<TrendingReposDTO.Item> items = trendingRepos.items;
        for (TrendingReposDTO.Item item : items) {
            if (language.equals(item.language)) {
                count++;
            }
        }
        return count;
    }

    private List<Integer> mapIdsByLanguage(String language, TrendingReposDTO trendingRepos) {
        List<TrendingReposDTO.Item> items = trendingRepos.items;
        List<Integer> Ids = new ArrayList<>();
        for (TrendingReposDTO.Item item : items) {
            if (language.equals(item.language)) {
                Ids.add(item.id);
            }
        }
        return Ids;
    }
}
