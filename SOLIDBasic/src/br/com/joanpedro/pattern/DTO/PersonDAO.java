package br.com.joanpedro.pattern.DTO;

import java.util.List;

public interface PersonDAO {
	public void insert(Person person);
	public void remove(Person person);
	public List<Person> getPeople();
}
