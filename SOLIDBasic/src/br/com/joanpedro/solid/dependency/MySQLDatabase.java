package br.com.joanpedro.solid.dependency;

public class MySQLDatabase implements Database {

	@Override
	public void connect() {
		System.out.println("Connecting to a MYSQL database...");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting MySQL database...");
	}
}
