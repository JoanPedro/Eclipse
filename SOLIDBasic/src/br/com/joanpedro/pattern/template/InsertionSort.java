package br.com.joanpedro.pattern.template;

public class InsertionSort extends Algorithm {

	private int[] numbers;

	public InsertionSort(int[] numbers) {
		super();
		this.numbers = numbers;
	}

	@Override
	public void initialize() {
		System.out.println("Initializing insertion sort...");

	}

	@Override
	public void sorting() {
		int temp;
		int j;

		for (int i = 1; i < this.numbers.length; i++) {
			temp = this.numbers[i];
			j = i;

			while (j > 0 && this.numbers[j - 1] > temp) {
				this.numbers[j] = this.numbers[j - 1];
				j = j - 1;
			}
			this.numbers[j] = temp;
		}
	}

	@Override
	public void printResult() {
		for (int i = 0; i < this.numbers.length; i++)
			System.out.println(this.numbers[i] + "");

	}

}
