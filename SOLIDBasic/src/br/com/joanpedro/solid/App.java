package br.com.joanpedro.solid;

import br.com.joanpedro.solid.open.Quicksort;
import br.com.joanpedro.solid.open.SorterManager;

public class App {

	public static void main(String[] args) {
		SorterManager sorterManager = new SorterManager();
		sorterManager.sort(new Quicksort());
	}
}
