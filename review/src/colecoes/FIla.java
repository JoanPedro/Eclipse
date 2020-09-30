package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class FIla {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		// Adicionam elementos na fila
		fila.add("Ana"); // retorna falso
		fila.offer("Bia"); // Lança uma excessão
		fila.add("Carlos");
		fila.offer("Dania");
		fila.add("Maria");
		fila.offer("Guilherme");

		System.out.println(fila.peek()); // Retorna false
		System.out.println(fila.peek()); // Lança uma excessão
		System.out.println(fila.element());
		System.out.println(fila.element());

		System.out.println(fila.size());
		System.out.println(fila.isEmpty());

		System.out.println(fila.poll()); // Retorna o elemento e remove da fila. -> null
		System.out.println(fila.remove()); // Lança excessão
	}
}
