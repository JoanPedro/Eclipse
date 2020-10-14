package br.com.joanpedro.pattern.DTO;

public class Person {
	private String name;
	private int age;
	private String address;
	private String gender;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.name + "-" + this.age;
	}
}
