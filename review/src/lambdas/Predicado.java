package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		Predicate<Produto> isExpensive = produto -> (produto.preco * (1 - produto.desconto)) >= 750;

		Produto newProduto = new Produto("Notebook", 3893.89, 0.85);
		System.out.println(isExpensive.test(newProduto));
	}
}
