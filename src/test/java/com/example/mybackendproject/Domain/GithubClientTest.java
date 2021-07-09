package com.example.mybackendproject.Domain;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GithubClientTest {

    HttpClient httpClient = mock(HttpClient.class);
    HttpRequest httpRequest;
    HttpResponse httpResponse = mock(HttpResponse.class);
    GithubClient githubClient = new GithubClient(httpClient, httpRequest);


    @Test
    void getTrendingReposDTO_whenGithubRequestSucceed_thenMapResponseDataToTrendingReposDTO() throws IOException, InterruptedException {
        when(httpClient.send(eq(httpRequest), any())).thenReturn(httpResponse);
        when(httpResponse.body()).thenReturn("{\"total_count\":12345,\"incomplete_results\":false,\"items\":null}");
        TrendingReposDTO trendingReposDTO = githubClient.getTrendingReposDTO();
        assertEquals(trendingReposDTO.total_count, 12345);
    }
}