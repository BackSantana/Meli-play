package com.meli_play.gestao_pessoas.service;

import com.meli_play.gestao_pessoas.model.Cliente;
import com.meli_play.gestao_pessoas.model.Pedido;
import com.meli_play.gestao_pessoas.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();

    public void add(Cliente cliente){
        clientes.add(cliente);
    }

    public List<Pedido> pedidos(Cliente cliente){
        return cliente.getPedidos();
    }

    public List<Cliente> clientes(){
        return clientes;
    }

    public Cliente selectCliente(long index){
        Optional<Cliente> clienteAux = clientes.stream().filter(cliente -> cliente.getId() == index).findFirst();
        if(!clienteAux.isPresent())
            return null;
        return clienteAux.get();
    }
}
