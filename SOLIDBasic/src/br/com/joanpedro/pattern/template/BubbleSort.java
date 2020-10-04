package br.com.joanpedro.pattern.template;

public class BubbleSort extends Algorithm {

	private int[] numbers;

	public BubbleSort(int[] numbers) {
		super();
		this.numbers = numbers;
	}

	@Override
	public void initialize() {
		System.out.println("Initializing bubble sort...");

	}

	@Override
	public void sorting() {
		int n = this.numbers.length;
		int temp;

		while (n != 0) {
			temp = 0;

			for (int i = 1; i < n; i++) {
				if (this.numbers[i - 1] > this.numbers[i]) {
					int swap = this.numbers[i - 1];
					this.numbers[i - 1] = this.numbers[i];
					this.numbers[i] = swap;
					temp = i;
				}
			}
			n = temp;
		}

	}

	@Override
	public void printResult() {
		for (int i = 0; i < this.numbers.length; i++)
			System.out.println(this.numbers[i] + "");
	}

}
