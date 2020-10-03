package br.com.joanpedro.solid.dependency;

public class OracleDatabase implements Database {
	
	public void connect() {
		System.out.println("Connecting to Oracle database...");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting Oracle database...");

	}
}
