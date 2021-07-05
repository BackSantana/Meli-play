package com.meli.restaurante.service;

import com.meli.restaurante.model.Mesa;
import com.meli.restaurante.model.Pedido;
import com.meli.restaurante.model.Prato;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ServiceAll {
    List<Pedido> pedidos = new ArrayList<>();
    List<Mesa> mesas = new ArrayList<>();

    public long add(Pedido pedido){
        pedidos.add(pedido);
        pedido.getMesa().setId(pedido.getId());
        mesas.add(pedido.getMesa());
        return pedidos.indexOf(pedido);
    }

    public BigDecimal fechaCaixa(Mesa mesa){
        Double tes = mesas.stream().filter( m -> m.getId() == mesa.getId()).mapToDouble(m -> m.getValorTotalConsumo()).sum();
        mesas.remove(mesa);
        return BigDecimal.valueOf(tes);
     }

    public List<Mesa> totalPorMesa(int index){
       return mesas.stream().filter(mesa -> mesa.getId() == index).collect(Collectors.toList());
    }

    public Mesa selectMesa(long index){
        Optional<Mesa> mesaAux =  mesas.stream().filter(mesa -> mesa.getId() == index).findFirst();
        if(!mesaAux.isPresent())
            return null;
        return mesaAux.get();
    }
}
