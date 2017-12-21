package com.monteiro.stratey.investimento;

public class RealizaInvestimentos {

public void realizaInvestimentos(Conta conta,Investimento investimento) {
	double resultado = investimento.calculaInvestimento(conta);
	System.out.println("Valor investido : " + resultado);
	conta.deposita(resultado * 0.75);
	
	System.out.println("Novo saldo :" + conta.getSaldo());
}

}
