package br.com.joanpedro.pattern.builder;

public class App {
	public static void main(String[] args) {
		Person person = new Person.Builder("Joan Pedro", "joanpedro@email.com").setAge(23).setAddress("Rua boa esperança").setUniversity("SENAI").build();
		System.out.println(person);
	}
}
