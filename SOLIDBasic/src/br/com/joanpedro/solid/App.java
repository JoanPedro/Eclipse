package br.com.joanpedro.solid;

import br.com.joanpedro.solid.single.Book;

public class App {

	public static void main(String[] args) {
		Book book1 = new Book("Albert Camus", 120);
		book1.save();
	}
}
