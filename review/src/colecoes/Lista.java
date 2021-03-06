package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();

		lista.add(new Usuario("Joan Pedro"));
		lista.add(new Usuario("Raiana Soveral"));
		lista.add(new Usuario("Carlos Teixeira"));
		lista.add(new Usuario("Beatriz Argolo"));
		lista.add(new Usuario("Izabela Maurício"));

		System.out.println(lista.get(2));
		System.out.println(lista.remove(2));
		System.out.println(lista.remove(new Usuario("Izabela Maurício")));

		System.out.println(lista.contains(new Usuario("Lia")));

		for (Usuario usuario : lista) {
			System.out.println(usuario.getNome());
		}
	}
}
