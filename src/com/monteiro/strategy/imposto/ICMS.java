package com.monteiro.strategy.imposto;

import com.monteiro.commons.Orcamento;

public class ICMS implements Imposto {
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
