package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private int minas;

	private final List<Campo> campos = new ArrayList<Campo>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;

		gerarCampos();
		associarVizinho();
		sortearMinas();
	}

	public void canAbrir(int linha, int coluna) {
		campos.parallelStream().filter(campo -> campo.getLinha() == linha || campo.getColuna() == coluna).findFirst()
				.ifPresent(campo -> campo.canAbrir());
	}

	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream().filter(campo -> campo.getLinha() == linha || campo.getColuna() == coluna).findFirst()
				.ifPresent(campo -> campo.alternarMarcacao());
	}

	private void gerarCampos() {
		for (int linha = 0; linha < this.linhas; linha++) {
			for (int coluna = 0; coluna < this.colunas; coluna++) {
				campos.add(new Campo(linha, coluna));
			}
		}
	}

	private void associarVizinho() {
		for (Campo c1 : campos) {
			for (Campo c2 : campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}

	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> isMinado = campo -> campo.getIsMinado();

		do {
			minasArmadas = campos.stream().filter(isMinado).count();

			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
		} while (minasArmadas < this.minas);
	}

	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(campo -> campo.objetivoAlcancado());
	}

	public void reiniciar() {
		campos.stream().forEach(campo -> campo.reiniciar());
		this.sortearMinas();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		int i = 0;
		for (int linha = 0; linha < this.linhas; linha++) {
			for (int coluna = 0; coluna < this.colunas; coluna++) {
				sb.append(" ");
				sb.append(campos.get(i));
				sb.append(" ");
				i++;
			}

			sb.append("\n");
		}

		return sb.toString();
	}
}
