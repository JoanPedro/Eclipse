package br.com.joanpedro.pattern.nullPointer;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private List<String> customerNames;

	public Database() {
		this.customerNames = new ArrayList<String>();
		this.customerNames.add("Daniel");
		this.customerNames.add("Michael");
		this.customerNames.add("Adam");
		this.customerNames.add("Joe");
	}

	public boolean existsCustomer(String name) {
		for (String string : customerNames) {
			if (string.equals(name))
				return true;
		}

		return false;
	}
}
