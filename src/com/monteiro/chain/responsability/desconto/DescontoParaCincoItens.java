package com.monteiro.chain.responsability.desconto;

import com.monteiro.commons.Orcamento;

public class DescontoParaCincoItens implements Desconto{
		private Desconto proximo;
	@Override
	public double calculaDesconto(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}else {
			return proximo.calculaDesconto(orcamento);
		}
		
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

}
