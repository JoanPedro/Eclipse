package br.com.joanpedro.pattern.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		List<ShoppingItem> items = new ArrayList<>();
		items.add(new Table("Desk", 230));
		items.add(new Chair("Black chair", 30));
		items.add(new Chair("Chair White", 25));
		
		double sum = 0;
		
		ShoppingCartVisitor shoppingCart = new ShoppingCart();
		
		Function<ShoppingItem, Double> acceptItems = shoppingItem -> shoppingItem.accept(shoppingCart);
		items.stream()
			.map(acceptItems)
			.reduce((acc, total) -> acc + total)
			.ifPresent(System.out::println);
		
		for (ShoppingItem shoppingItem : items) {
			sum += shoppingItem.accept(shoppingCart);
		}
		System.out.println(sum);
		
	}
}