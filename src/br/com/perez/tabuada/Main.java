package br.com.perez.tabuada;

import br.com.perez.tabuada.gui.TelaTabuada;
import br.com.perez.tabuada.model.Tabuada;

public class Main {

	public static void main(String[] args) {
		
		TelaTabuada tela = new TelaTabuada();
		tela.criarTela();
		
		Tabuada t = new Tabuada();
		t.setMultiplicando(9);
		t.setMenorMultiplicador(5);
		t.setMaiorMultiplicador(20);
		t.mostrarTabuada();
	
	}

}
