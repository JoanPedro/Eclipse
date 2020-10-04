package br.com.joanpedro.pattern.template;

public abstract class Algorithm {

	public abstract void initialize();

	public abstract void sorting();

	public abstract void printResult();
	
	public void sort() {
		this.initialize();
		this.sorting();
		this.printResult();
	}

}
