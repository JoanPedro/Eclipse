package br.com.joanpedro.pattern.strategy;

public class App {
	public static void main(String[] args) {
		Strategy adition = new Add();
		Strategy multiplication = new Multiply();

		Manager manager = new Manager();
		manager.setStrategy(adition);

		manager.operation(3, 3);
	}
}
