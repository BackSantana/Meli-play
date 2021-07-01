package com.metros.dao;

import com.metros.model.Casa;
import com.metros.model.Comodo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CasaDAO {
    private static List<Casa> casas = new ArrayList<Casa>();

    public void adicionar(Casa casa) {
        casas.add(casa);
    }

    public List<Casa> getList(){
        return casas;
    }

    public Casa getCasa(long id){
        Optional<Casa> responseCasa = casas.stream().filter(casa -> casa.getId() == id).findFirst();
        if(!responseCasa.isPresent())
            return null;
        return responseCasa.get();
    }
}
