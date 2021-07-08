package com.example.mybackendproject.Domain;

import java.util.List;

public class TrendingReposDTO {
    public final Integer total_count;
    public final Boolean incomplete_results;
    public final List<ItemDTO> itemDTOS;

    public TrendingReposDTO(Integer total_count, Boolean incomplete_results, List<ItemDTO> itemDTOS) {
        this.total_count = total_count;
        this.incomplete_results = incomplete_results;
        this.itemDTOS = itemDTOS;
    }
}
