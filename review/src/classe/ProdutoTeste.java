package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4356.89);
		var p2 = new Produto("Caneta Preta", 12.56);

		System.out.println(p2.nome);
		
		double comDesconto = p1.aplicarDesconto();
		double comMaisDesconto = p1.aplicarDesconto(0.35);

		System.out.println(comDesconto);
		System.out.println(comMaisDesconto);

	}
}
