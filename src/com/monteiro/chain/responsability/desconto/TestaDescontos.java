package com.monteiro.chain.responsability.desconto;

import com.monteiro.commons.Orcamento;

public class TestaDescontos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(600.0);
		
		Desconto d1 = new DescontoParaCincoItens();
		Desconto d2 = new DescontoValorAcima500();
		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		
		double desconto = d1.calculaDesconto(orcamento);
		System.out.println(desconto);

	}

}
