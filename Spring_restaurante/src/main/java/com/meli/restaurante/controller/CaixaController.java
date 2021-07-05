package com.meli.restaurante.controller;

import com.meli.restaurante.model.Caixa;
import com.meli.restaurante.model.Mesa;
import com.meli.restaurante.service.ServiceAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("api/caixa")
public class CaixaController {

    @Autowired
    ServiceAll serviceAll;

    @RequestMapping("/{id}")
    public BigDecimal fecharCaixa(@PathVariable long id){
        Mesa mesa = serviceAll.selectMesa(id);
        Caixa.setValorTotalCaixa(serviceAll.fechaCaixa(mesa));
        return Caixa.getValorTotalCaixa();
    }
}
