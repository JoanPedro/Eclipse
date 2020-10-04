package br.com.joanpedro.pattern.nullPointer;

public class CustomerFactory {

	private Database database;

	public CustomerFactory(Database database) {
		super();
		this.database = database;
	}

	public AbstractCustomer getCustomer(String name) {
		if (this.checkName(name)) {
			return new RealCustomer(name);
		}

		return new NullCustomer();
	}

	private boolean checkName(String name) {
		if(this.database.existsCustomer(name))
			return true;
		
		return false;
	}

}
