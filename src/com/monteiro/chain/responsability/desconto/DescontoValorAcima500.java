package com.monteiro.chain.responsability.desconto;

import com.monteiro.commons.Orcamento;

public class DescontoValorAcima500 implements Desconto {
	private Desconto proximo;
	@Override
	public double calculaDesconto(Orcamento orcamento) {
		if(orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}else {
			return proximo.calculaDesconto(orcamento);
		}
		
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
		
	}

}
