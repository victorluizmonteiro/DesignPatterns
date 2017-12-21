package com.monteiro.strategy.imposto;

import com.monteiro.commons.Orcamento;

public class TesteCalculadoraStrategy {
        public static void main(String[] args){
        	//Testando padrão de projeto Strategy
            Orcamento orcamento = new Orcamento(500);
            ICMS icms = new ICMS();
            ISS iss = new ISS();
            ICCC iccc = new ICCC();

            CalculaImpostos calculador = new CalculaImpostos();

            calculador.calculaImpostos(orcamento,icms);
            calculador.calculaImpostos(orcamento, iss);
            calculador.calculaImpostos(orcamento, iccc);
            



        }

}
