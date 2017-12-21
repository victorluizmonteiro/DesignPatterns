package com.monteiro.stratey.investimento;
import java.util.Random;

public class Arrojado implements Investimento {
	Random random;

	public Arrojado() {
		this.random = new Random();
	}

	@Override
	public double calculaInvestimento(Conta conta) {
		// recebe um numero entre 0 e 9;
		int chute = random.nextInt(10);
		// 20%
		if (chute >= 0 && chute <= 1)
			return conta.getSaldo() * 0.05;
		// 30%
		else if (chute >= 2 && chute <= 4)
			return conta.getSaldo() * 0.03;
		// 50%
		else
			return conta.getSaldo() * 0.006;
	}

}
