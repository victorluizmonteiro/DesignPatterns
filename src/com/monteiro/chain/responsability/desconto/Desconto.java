package com.monteiro.chain.responsability.desconto;

import com.monteiro.commons.Orcamento;

public interface Desconto {
	public double calculaDesconto(Orcamento orcamento);
	
	public void setProximo(Desconto desconto);

}
