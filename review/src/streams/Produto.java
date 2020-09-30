package streams;

public class Produto {

	private final String nome;
	private final double preco;
	private final double desconto;
	private final double valorFrete;

	public Produto(String nome, double preco, double desconto, double valorFrete) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.valorFrete = valorFrete;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public double getValorFrete() {
		return valorFrete;
	}

}
