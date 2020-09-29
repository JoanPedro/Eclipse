package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {

	private final int linha;
	private final int coluna;

	private boolean minado = false;
	private boolean aberto = false;
	private boolean marcado = false;

	private List<Campo> vizinhos = new ArrayList<Campo>();

	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public boolean adicionarVizinho(Campo candidatoAVizinho) {
		boolean linhaDiferente = this.linha != candidatoAVizinho.linha;
		boolean colunaDiferente = this.coluna != candidatoAVizinho.coluna;
		boolean isDiagonal = linhaDiferente && colunaDiferente;

		int deltaLinha = Math.abs(this.linha - candidatoAVizinho.linha);
		int deltaColuna = Math.abs(this.coluna - candidatoAVizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		System.out.println(deltaGeral);

		if (deltaGeral == 1 && !isDiagonal) {
			vizinhos.add(candidatoAVizinho);
			return true;
		} else if (deltaGeral == 2 && isDiagonal) {
			vizinhos.add(candidatoAVizinho);
			return true;
		}

		return false;
	}

}
