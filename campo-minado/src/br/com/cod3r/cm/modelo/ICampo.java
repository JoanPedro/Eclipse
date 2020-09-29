package br.com.cod3r.cm.modelo;

interface ICampo {
	public int linha = 0;
	public int coluna = 0;

	boolean adicionarVizinho(ICampo candidatoAVizinho);
}
