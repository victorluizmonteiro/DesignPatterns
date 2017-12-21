package com.monteiro.strategy.imposto;

import com.monteiro.commons.Orcamento;

public class CalculaImpostos {

    public void calculaImpostos(Orcamento orcamento,Imposto imposto){

        double calculo = imposto.calcula(orcamento);

        System.out.println(calculo);
    }
}
