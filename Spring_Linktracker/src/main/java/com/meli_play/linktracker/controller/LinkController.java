package com.meli_play.linktracker.controller;

import com.meli_play.linktracker.dto.LinkRequest;
import com.meli_play.linktracker.dto.LinkRequestValidationPass;
import com.meli_play.linktracker.dto.LinkResponse;
import com.meli_play.linktracker.dto.MetricasDto;
import com.meli_play.linktracker.model.Link;
import com.meli_play.linktracker.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;

// Esqueci de fazer o invalidador de url
@RestController
@RequestMapping("/api/link")
public class LinkController {

    @Autowired
    LinkService linkService;

    @PostMapping
    @RequestMapping("/cadastrar")
    public ResponseEntity<LinkResponse> cadastrar(@RequestBody @Valid LinkRequest linkRequest){
        Link link = linkRequest.convert(linkRequest);
        linkService.addLink(link);
        LinkResponse linkResponse = new LinkResponse(link.getId(), link.getUrl());
        return ResponseEntity.ok(linkResponse);
    }

    @PostMapping()
    @RequestMapping("/{id}")
    public RedirectView redirect(@PathVariable long id, @RequestBody LinkRequestValidationPass linkPass){
        linkService.validaSenha(linkPass.getSenha());
        Link link = linkService.selectID(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(link.getUrl());
        return redirectView;
    }

    @GetMapping("/metrics/{id}")
    public ResponseEntity<MetricasDto> sumLink(@PathVariable long id){
        long metricas = linkService.getEstatisticas(id);
        return ResponseEntity.ok(new MetricasDto(metricas));
    }
}
