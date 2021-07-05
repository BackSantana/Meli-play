package com.meli_play.linktracker.dto;

public class MetricasDto {
    private Long redirects;

    public MetricasDto() {
    }

    public MetricasDto(Long redirects) {
        this.redirects = redirects;
    }

    public Long getRedirects() {
        return redirects;
    }
}
