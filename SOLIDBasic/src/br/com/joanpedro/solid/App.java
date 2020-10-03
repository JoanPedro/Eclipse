package br.com.joanpedro.solid;

import br.com.joanpedro.solid.dependency.DatabaseHandler;
import br.com.joanpedro.solid.dependency.OracleDatabase;

public class App {

	public static void main(String[] args) {

		DatabaseHandler databaseHandler = new DatabaseHandler(new OracleDatabase());

		databaseHandler.connect();
		databaseHandler.disconnect();
	}
}
