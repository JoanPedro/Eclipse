package classe.desafio;

public class Pessoa {
	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Joan Pedro", 99.9);
		Comida c1 = new Comida("Caruru", 0.320);
		Comida c2 = new Comida("Feijão", 0.720);

		System.out.printf("Nome: %s, Peso antes: %f\n", p1.nome, p1.peso);
		p1.comer(c1);
		System.out.printf("Nome: %s, Peso depois: %f\n", p1.nome, p1.peso);

		System.out.printf("Nome: %s, Peso antes: %f\n", p1.nome, p1.peso);
		p1.comer(c2);
		System.out.printf("Nome: %s, Peso depois: %f\n", p1.nome, p1.peso);

		System.out.printf("Nome: %s, Peso antes: %f\n", p1.nome, p1.peso);
		p1.comer(new Comida("Prato Feito", 1.200));
		System.out.printf("Nome: %s, Peso depois: %f\n", p1.nome, p1.peso);

	}

	void comer(Comida comida) {
		this.peso += comida.peso;
	}
}
