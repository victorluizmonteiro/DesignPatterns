package com.monteiro.stratey.investimento;

public class TestaInvestimentos {

	public static void main(String[] args) {
		Arrojado arrojado = new Arrojado();
		Conta conta = new Conta();
		conta.deposita(500);
		RealizaInvestimentos realizaInvest = new RealizaInvestimentos();
		realizaInvest.realizaInvestimentos(conta, arrojado);

	}

}
