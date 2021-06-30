package com.company.meli_play;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Integer chave = 0;
    private static Map<Integer, List<Vestuario>> guardaRoupas = new HashMap<>();

    public Integer guardarVestuario(List<Vestuario> roupas) {
        guardaRoupas.put(chave, roupas);
        int aux = chave;
        chave++;
        return aux;
    }

    public List<Vestuario> devolverRoupas(Integer id){
        if(!guardaRoupas.containsKey(id))
            System.out.println("Nenhuma roupa cadastrada para esta chave de segurança");

        return guardaRoupas.remove(id);
    }

    public void getGuardaRoupas(){
//        System.out.println( guardaRoupas.entrySet());
        guardaRoupas.forEach( (key, value) -> System.out.println("Chave: " + key + " --- Roupas : " + value));
     }
}
