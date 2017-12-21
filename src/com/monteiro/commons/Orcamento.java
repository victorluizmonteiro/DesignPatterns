package com.monteiro.commons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private double valor;
    private List<Item>itens;

  


	public Orcamento(double valor) {
		
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}

	
	



	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}




	public void adicionaItens(Item item) {
		this.itens.add(item);
	}



	public void setValor(double valor) {
		this.valor = valor;
	}




	public double getValor() {
        return valor;
    }
}
