package br.com.joanpedro.pattern.template;

public class App {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 3, 8, 2, -2, 10 };
		
		Algorithm sortAlgorithm = new InsertionSort(numbers);
		sortAlgorithm.sort();
	}
}
