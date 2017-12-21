package com.monteiro.chain.responsability.desconto;

import com.monteiro.commons.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double calculaDesconto(Orcamento orcamento) {
		
		return  0 ;
	}

	@Override
	public void setProximo(Desconto desconto) {
		// TODO Auto-generated method stub
		
	}

}
