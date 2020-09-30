package lambdas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {

		Consumer<Produto> imprimir = produto -> System.out.println(produto.nome + "!!!");

		Produto p1 = new Produto("Caneta Preta", 13.354, 0.9);
		Produto p2 = new Produto("Caneta Azul", 14.354, 0.8);
		Produto p3 = new Produto("Caneta Marrom", 15.354, 0.7);
		Produto p4 = new Produto("Caneta Laranja", 16.354, 0.6);
		Produto p5 = new Produto("Caneta Verde", 17.354, 0.5);
		imprimir.accept(p1);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		SortedSet<Double> inteiro = new TreeSet<Double>();

		inteiro.add(1.0);
		inteiro.add(2.0);
		inteiro.add(3.0);
		inteiro.add(4.0);
		inteiro.add(5.0);

		Map<Double, Produto> mapa = new HashMap<Double, Produto>();

		produtos.forEach(produto -> mapa.put(produto.desconto, produto));
		System.out.println(mapa);

		produtos.forEach(imprimir);
		produtos.forEach(produto -> System.out.println(produto.preco));
		produtos.forEach(System.out::println);
	}
}
