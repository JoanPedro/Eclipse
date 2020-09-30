package streams;

public class Media {
	private double total;
	private int quantidade;

	public Media adicionar(double valor) {
		setTotal(getTotal() + valor);
		setQuantidade(getQuantidade() + 1);
		return this;
	}

	static public Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.setQuantidade(m1.getQuantidade() + m2.getQuantidade());
		resultante.setTotal(m1.getTotal() + m2.getTotal());
		return resultante;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getValor() {
		return this.total / this.quantidade;
	}

}
