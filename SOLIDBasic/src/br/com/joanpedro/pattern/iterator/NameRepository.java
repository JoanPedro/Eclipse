package br.com.joanpedro.pattern.iterator;

public class NameRepository {
	private String[] names = { "Adam", "Joe", "John", "Sarah" };

	public Iterator getIterator() {
		return new NameIterator(this.names);
	}
}
