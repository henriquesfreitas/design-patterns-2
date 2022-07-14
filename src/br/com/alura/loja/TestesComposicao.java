package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.OrcamentoProxy;

public class TestesComposicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://refactoring.guru/design-patterns/composite
		//Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.
		//in this example we used an interface to get the value from both Orcamento and ItemOrcamento
		Orcamento orcamentoAntigo = new Orcamento();
		orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		orcamentoAntigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		novo.adicionarItem(orcamentoAntigo);

		//https://refactoring.guru/design-patterns/proxy
		//Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. 
		//A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
		//in this example we used proxy so we don't need call the getValor() twice, and act as a cache
		OrcamentoProxy orcamentoProxy = new OrcamentoProxy(novo);
		System.out.println(orcamentoProxy.getValor());
		System.out.println(orcamentoProxy.getValor());
	}

}
