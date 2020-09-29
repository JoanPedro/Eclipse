package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {

	private Campo campo = new Campo(3, 3);

	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}

	@Test
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo(3, 2);
		boolean beAdd = campo.adicionarVizinho(vizinho);

		assertTrue(beAdd);
	}

	@Test
	void testeVizinhoDistancia1Direita() {
		Campo vizinho = new Campo(3, 4);
		boolean beAdd = campo.adicionarVizinho(vizinho);

		assertTrue(beAdd);
	}

	@Test
	void testeVizinhoDistancia1Cima() {
		Campo vizinho = new Campo(2, 3);
		boolean beAdd = campo.adicionarVizinho(vizinho);

		assertTrue(beAdd);
	}

	@Test
	void testeVizinhoDistancia1Baixo() {
		Campo vizinho = new Campo(4, 3);
		boolean beAdd = campo.adicionarVizinho(vizinho);

		assertTrue(beAdd);
	}
	
	@Test
	void testeVizinhoDistancia2Noroeste() {
		Campo vizinho = new Campo(2, 2);
		boolean beAdd = campo.adicionarVizinho(vizinho);

		assertTrue(beAdd);
	}
	
	@Test
	void testeVizinhoDistancia2Nordeste() {
		Campo vizinho = new Campo(2, 4);
		boolean beAdd = campo.adicionarVizinho(vizinho);

		assertTrue(beAdd);
	}
	
	@Test
	void testeVizinhoDistancia2Sudoeste() {
		Campo vizinho = new Campo(4, 2);
		boolean beAdd = campo.adicionarVizinho(vizinho);

		assertTrue(beAdd);
	}
	
	@Test
	void testeVizinhoDistancia2Sudeste() {
		Campo vizinho = new Campo(4, 4);
		boolean beAdd = campo.adicionarVizinho(vizinho);

		assertTrue(beAdd);
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(1, 1);
		boolean beAdd = campo.adicionarVizinho(vizinho);

		assertFalse(beAdd);
	}
}
