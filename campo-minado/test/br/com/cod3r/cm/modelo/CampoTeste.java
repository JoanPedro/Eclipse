package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excessao.ExplosaoException;

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
	void testeVizinhoDistanciaIgual() {
		Campo vizinho = new Campo(3, 3);
		boolean beAdd = campo.adicionarVizinho(vizinho);

		assertFalse(beAdd);
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

	@Test
	public void testeValorPadraoAtributoIsMarcacao() {
		assertFalse(campo.getIsMarcado());
	}

	@Test
	public void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.getIsMarcado());
	}

	@Test
	public void testeAlternarMarcacao2Chamads() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();

		assertFalse(campo.getIsMarcado());
	}

	@Test
	public void testeAbrirNaoMinadoNaoMarcado() {
		boolean canAbrir = campo.canAbrir();

		assertTrue(canAbrir);
	}

	@Test
	public void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		boolean canAbrir = campo.canAbrir();

		assertFalse(canAbrir);
	}

	@Test
	public void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		boolean canAbrir = campo.canAbrir();

		assertFalse(canAbrir);
	}

	@Test
	public void testeAbrirMinadoNaoMarcado() {
		campo.minar();

		assertThrows(ExplosaoException.class, () -> {
			campo.canAbrir();
		});
	}

	@Test
	public void testeAbrirComVizinhos() {

		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo.adicionarVizinho(campo22);

		campo.canAbrir();
		assertTrue(campo22.getIsAberto() && campo11.getIsAberto());

	}

	@Test
	public void testeAbrirComVizinhos2() {

		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);
		campo12.minar();

		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);

		campo.adicionarVizinho(campo22);
		campo.canAbrir();

		assertTrue(campo22.getIsAberto() && campo11.isFechado());

	}
}
