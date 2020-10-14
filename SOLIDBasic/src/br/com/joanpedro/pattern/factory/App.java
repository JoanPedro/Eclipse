package br.com.joanpedro.pattern.factory;

public class App {
	public static void main(String[] args) {
		Algorithm algorithm = AlgorithmFactory.createAlgorithm(AlgorithmFactory.SHORTEST_PATH);
		algorithm.solve();
	}
}
