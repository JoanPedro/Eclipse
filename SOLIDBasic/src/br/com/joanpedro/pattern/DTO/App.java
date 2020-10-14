package br.com.joanpedro.pattern.DTO;

public class App {
	public static void main(String[] args) {
		Database database = new Database();
		
		Person adam = new Person("Adam", 37);
		
		database.insert(new Person("John", 27));
		database.insert(adam);
		database.insert(new Person("Joe", 47));
		
		database.getPeople().forEach(System.out::println);
		
		database.remove(adam);
		
		database.getPeople().forEach(System.out::println);
	}
}
