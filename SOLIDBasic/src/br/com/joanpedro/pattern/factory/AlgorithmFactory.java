package br.com.joanpedro.pattern.factory;

public class AlgorithmFactory {
	public static final int SHORTEST_PATH = 0;
	public static final int SPANNING_TREE = 1;
	
	private AlgorithmFactory() { }
	
	public static Algorithm createAlgorithm(int type) {
		switch (type) {
		case SHORTEST_PATH:
			return new ShortestPath();
		case SPANNING_TREE:
			return new SpanningTree();
		default:
			return null;
		}
	}
}
