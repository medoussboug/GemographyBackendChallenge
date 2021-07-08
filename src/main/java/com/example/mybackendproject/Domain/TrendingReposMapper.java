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
        List<LanguageTrendingReposDTO> trendingReposResponseDTOS = new ArrayList<>();
        for (String trendingReposLanguage : trendingReposLanguages) {
            trendingReposResponseDTOS.add(new LanguageTrendingReposDTO(trendingReposLanguage, this.calculateNumberOfUsageOfLanguage(trendingReposLanguage, trendingRepos), this.mapIdsByLanguage(trendingReposLanguage, trendingRepos)));
        }
        return new LanguagesTrendingReposDTO(trendingReposResponseDTOS);
    }

    private List<String> getTrendingReposLanguages(TrendingReposDTO trendingRepos) {
        List<String> languagesList;
        Set<String> temp = new HashSet<>();
        trendingRepos.itemDTOS.forEach(item -> temp.add(item.language));
        languagesList = new ArrayList<>(temp);
        languagesList.remove(null);
        return languagesList;
    }

    private Integer calculateNumberOfUsageOfLanguage(String language, TrendingReposDTO trendingRepos) {
        int count = 0;
        List<ItemDTO> itemDTOS = trendingRepos.itemDTOS;
        for (ItemDTO itemDTO
                : itemDTOS) {
            if (language.equals(itemDTO.language)) {
                count++;
            }
        }
        return count;
    }

    private List<Integer> mapIdsByLanguage(String language, TrendingReposDTO trendingRepos) {
        List<ItemDTO> itemDTOS = trendingRepos.itemDTOS;
        List<Integer> Ids = new ArrayList<>();
        for (ItemDTO itemDTO
                : itemDTOS) {
            if (language.equals(itemDTO.language)) {
                Ids.add(itemDTO.id);
            }
        }
        return Ids;
    }
}
