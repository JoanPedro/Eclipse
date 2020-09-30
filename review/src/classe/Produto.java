package classe;

interface GenericProduto {
	String nome = "";
	double preco = 0;
	double desconto = 0;

	double aplicarDesconto();
}

public class Produto implements GenericProduto {

	String nome;
	double preco;
	static final double desconto = 0.25;

	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double aplicarDesconto() {
		return this.preco * (1 - desconto);
	}
	
	public double aplicarDesconto(double desconto) {
		return this.preco * (1 - desconto);
	}

}
