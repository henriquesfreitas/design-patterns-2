package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = new DescontoParaOrcamentoItens(
				new DescontoParaOrcamentoPorValor(
						new SemDesconto()));
		
		return cadeiaDeDescontos.calcular(orcamento);
		
	}

}
