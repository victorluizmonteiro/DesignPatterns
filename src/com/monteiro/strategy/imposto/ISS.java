package com.monteiro.strategy.imposto;

import com.monteiro.commons.Orcamento;

public class ISS implements  Imposto {


    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
