package com.company.meli_play;

import java.time.LocalDate;

/*
Crie uma classe Data. A classe conterá, além dos construtores que você considera apropriados, métodos de acesso e o método toString,
conforme explicamos no exercício anterior, um método para verificar se a data está correta e outro para adicionar um dia ao valor atual da data. A
A classe GregorianCalendar deve ser investigada e usada para implementar os construtores e métodos Date.
 */
public class Data {
    private String data;

    public Data(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String verificaData(){
        LocalDate localDate = LocalDate.parse(this.data);
        LocalDate localDateAtual = LocalDate.now();

        if (!localDateAtual.isEqual(localDate))
            return "A data enviada está errado";
        else
            return "Data correta";
    }

    public String addDay( ){
        LocalDate localDate = LocalDate.parse(this.data);
        LocalDate date = localDate.plusDays(1);
      return "Um dia adicionado -> " + String.valueOf(date);
    }
}
