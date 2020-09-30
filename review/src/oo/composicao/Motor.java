package oo.composicao;

public class Motor {
	Carro carro;
	double fatorInjecao = 1;
	boolean ligado = false;

	Motor(Carro carro) {
		this.carro = carro;
	}

	int giros() {
		if (!this.ligado) {
			return 0;
		}
		return (int) Math.round(this.fatorInjecao * 3000);
	}
}
