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
		boolean linhaDiferente = this.getLinha() != candidatoAVizinho.linha;
		boolean colunaDiferente = this.getColuna() != candidatoAVizinho.coluna;
		boolean isDiagonal = linhaDiferente && colunaDiferente;

		int deltaLinha = Math.abs(this.getLinha() - candidatoAVizinho.linha);
		int deltaColuna = Math.abs(this.getColuna() - candidatoAVizinho.coluna);
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
		if (!this.isAberto) {
			this.isMarcado = !this.isMarcado;
		}
	}

	public boolean canAbrir() {

		if (!this.isAberto && !this.isMarcado) {
			this.isAberto = true;

			if (this.isMinado) {
				throw new ExplosaoException();
			}

			if (isVizinhancaSegura()) {
				vizinhos.forEach(vizinho -> vizinho.canAbrir());
			}

			return true;
		}

		return false;
	}

	public boolean isVizinhancaSegura() {
		return vizinhos.stream().noneMatch(vizinho -> vizinho.getIsMinado());
	}

	public boolean getIsMarcado() {
		return this.isMarcado;
	}

	void minar() {
		if (!this.isMinado) {
			this.isMinado = true;
		}
	}

	public boolean getIsAberto() {
		return this.isAberto;
	}

	public boolean getIsMinado() {
		return this.isMinado;
	}

	public boolean isFechado() {
		return !this.getIsAberto();
	}

	public int getLinha() {
		return this.linha;
	}

	public int getColuna() {
		return this.coluna;
	}

	public void setMinado(boolean isMinado) {
		this.isMinado = isMinado;
	}

	public void setAberto(boolean isAberto) {
		this.isAberto = isAberto;
	}

	public void setMarcado(boolean isMarcado) {
		this.isMarcado = isMarcado;
	}

	boolean objetivoAlcancado() {
		boolean desvendado = !this.getIsMinado();
		boolean protegido = this.getIsMinado() && this.getIsMarcado();

		return desvendado || protegido;
	}

	long minasNaVizinhanca() {
		return vizinhos.stream().filter(vizinho -> vizinho.getIsMinado()).count();
	}

	void reiniciar() {
		this.setAberto(false);
		this.setMarcado(false);
		this.setMinado(false);
	}

	public String toString() {
		if (this.getIsMarcado()) {
			return "x";
		} else if (this.getIsAberto() && this.getIsMinado()) {
			return "*";
		} else if (this.getIsAberto() && this.minasNaVizinhanca() > 0) {
			return Long.toString(this.minasNaVizinhanca());
		} else if (this.getIsAberto()) {
			return " ";
		}

		return "?";
	}
}
