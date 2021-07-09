package com.example.mybackendproject.Domain;

import java.util.List;

public class TrendingReposDTO {
    public final Integer totalCount;
    public final Boolean incompleteResults;
    public final List<Item> items;

    public TrendingReposDTO(Integer totalCount, Boolean incompleteResults, List<Item> items) {
        this.totalCount = totalCount;
        this.incompleteResults = incompleteResults;
        this.items = items;
    }

    public static class Item {
        public final Integer id;
        public final String language;

        public Item(Integer id, String language) {
            this.id = id;
            this.language = language;
        }
    }
}
