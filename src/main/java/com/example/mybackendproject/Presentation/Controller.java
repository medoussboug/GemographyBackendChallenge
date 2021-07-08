package com.example.mybackendproject.Presentation;

import com.example.mybackendproject.Domain.TrendingReposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    TrendingReposService trendingReposService;

    @GetMapping("/repositories/languages")
    public String test() {
        return trendingReposService.performRequest();
    }
}
