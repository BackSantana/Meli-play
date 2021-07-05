package com.meli_play.linktracker.dto;

import com.meli_play.linktracker.model.Link;

public class LinkResponse {
    private long id;
    private String url;

    public LinkResponse(long id, String url) {
        this.url = url;
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public long getId() {
        return id;
    }

    public LinkResponse convert(Link link){
        return new LinkResponse(link.getId(), link.getUrl());
    }
}
