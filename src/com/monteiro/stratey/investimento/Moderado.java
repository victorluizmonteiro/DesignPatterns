package com.monteiro.stratey.investimento;
import java.util.Random;

public class Moderado implements Investimento{
		Random random = new Random();
	@Override
	public double calculaInvestimento(Conta conta) {
		
		if(random.nextInt(2) == 0 ) {
			return conta.getSaldo() * 0.025;
		}else {
			return conta.getSaldo() * 0.07;
		}
	}

}
