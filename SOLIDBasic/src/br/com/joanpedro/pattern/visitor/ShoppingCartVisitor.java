package br.com.joanpedro.pattern.visitor;

public interface ShoppingCartVisitor {
	public double visit(Table table);
	public double visit(Chair chair);
}
