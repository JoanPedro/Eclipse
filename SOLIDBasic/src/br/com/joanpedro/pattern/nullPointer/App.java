package br.com.joanpedro.pattern.nullPointer;

public class App {
	public static void main(String[] args) {
		Database database = new Database();
		CustomerFactory customerFactory = new CustomerFactory(database);
		
		System.out.println(customerFactory.getCustomer("Joan").getCustomer());
		
	}
}
