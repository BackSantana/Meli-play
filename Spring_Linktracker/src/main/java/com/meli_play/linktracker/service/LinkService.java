package com.meli_play.linktracker.service;

import com.meli_play.linktracker.exception.ValidationPass;
import com.meli_play.linktracker.exception.ValidationUrl;
import com.meli_play.linktracker.model.Link;
import com.meli_play.linktracker.repository.LinkRepository;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {
    @Autowired
    LinkRepository linkRepository;

    public boolean validaSenha(String senha){
        Link linkAux1 = linkRepository.selectBySenha(senha);
        if(isNull(linkAux1))
            throw new ValidationPass("Senha não encontrada, tente novamente");
        return true;
    }

    public Link addLink(Link link){
        Link aux = linkRepository.add(link);
        return aux;
    }

    public long getEstatisticas(Long id){
        return linkRepository.selectStatistica(id);
    }

    public Link selectID(Long id){
        Link linkOficial = linkRepository.selectID(id);
        if(isNull(linkOficial))
            throw new NullPointerException("Id não cadastrado");

        linkOficial.add(1);

        validaUlr(linkOficial.getUrl());
        return linkOficial;
    }

    public boolean validaUlr(String url) {
        String[] schemes = {"http","https"};
        UrlValidator urlValidator = new UrlValidator(schemes);

        if (urlValidator.isValid(url)) {
            return true;
        } else {
            throw new ValidationUrl("URL inválida");
         }
    }

    public boolean isNull(Link link){
        if(link == null)
            return true;
         return false;
    }
}
