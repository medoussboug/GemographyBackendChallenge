package com.example.mybackendproject.Presentation;

import com.example.mybackendproject.Domain.TrendingReposService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class LanguagesTrendingReposControllerTest {

    private TrendingReposService trendingReposService = mock(TrendingReposService.class);
    private LanguagesTrendingReposController controller = new LanguagesTrendingReposController(trendingReposService);

    @Test
    void getLanguagesTrendingReposDTO_invoketrendingReposService() {
        controller.getLanguagesTrendingReposDTO();
        verify(trendingReposService).mapLanguagesTrendingReposDTO();
    }

}