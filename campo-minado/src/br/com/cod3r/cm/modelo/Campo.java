package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.cm.excessao.ExplosaoException;

class Campo implements ICampo {

	private final int linha;
	private final int coluna;

	private boolean isMinado = false;
	private boolean isAberto = false;
	private boolean isMarcado = false;

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

		if (deltaGeral == 1 && !isDiagonal) {
			vizinhos.add(candidatoAVizinho);
			return true;
		} else if (deltaGeral == 2 && isDiagonal) {
			vizinhos.add(candidatoAVizinho);
			return true;
		}

		return false;
	}
	
	public void alternarMarcacao() {
		if(!this.isAberto) {
			this.isMarcado = !this.isMarcado;
			System.out.println(this.isMarcado);
		}
	}
	
	public boolean canAbrir() {
		
		if(!this.isAberto && !this.isMarcado) {
			this.isAberto = true;
			
			if(isMinado) {
				throw new ExplosaoException();
			}
			
			if(isVizinhancaSegura()) {
				vizinhos.stream().forEach(vizinho -> canAbrir());
			}
			
			return true;
		}

		return false;
	}

	public boolean isVizinhancaSegura() {
		return vizinhos.stream().noneMatch(vizinho -> vizinho.isMinado);
	}
	
	public boolean getIsMarcado() {
		return this.isMarcado;
	}
}
