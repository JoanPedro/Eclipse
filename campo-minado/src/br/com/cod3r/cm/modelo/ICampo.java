package br.com.cod3r.cm.modelo;


interface ICampo {
	boolean adicionarVizinho(Campo candidatoAVizinho);
	
	boolean canAbrir();
	
	boolean isVizinhancaSegura();
	
	void alternarMarcacao();
}
