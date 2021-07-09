package com.example.mybackendproject.Presentation;

import com.example.mybackendproject.Domain.LanguagesTrendingReposDTO;
import com.example.mybackendproject.Domain.TrendingReposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguagesTrendingReposController {

    @Autowired
    private final TrendingReposService trendingReposService;

    public LanguagesTrendingReposController(TrendingReposService trendingReposService) {
        this.trendingReposService = trendingReposService;
    }

    @GetMapping("/repositories/languages")
    public LanguagesTrendingReposDTO getLanguagesTrendingReposDTO() {
        return trendingReposService.mapLanguagesTrendingReposDTO();
    }
}
