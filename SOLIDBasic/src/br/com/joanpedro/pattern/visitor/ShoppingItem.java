package br.com.joanpedro.pattern.visitor;

public interface ShoppingItem {
	public double accept(ShoppingCartVisitor visitor);
}
