package com.meli_play.linktracker.repository;

import com.meli_play.linktracker.model.Link;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class LinkRepository {
    Map<Long, Link> links = new HashMap<>();

    public Link add(Link link){
        links.put(link.getId(), link);
        return links.get(link);
    }

    public Link selectID(Long id){
        return links.values().stream().filter(link -> link.getId() == id).findFirst().orElse(null);
    }

    public Link selectBySenha(String senha){
        return links.values().stream().filter(link -> link.getSenha().equals(senha)).findFirst().orElse(null);
    }

    // Precisa fazer uma validação, pode ser que retorne null.
    public long selectStatistica(Long id){
        return selectID(id).getChamadas();
    }
}
