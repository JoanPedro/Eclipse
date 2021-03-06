package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import classe.Usuario;

public class ConjuntoComportado {
	public static void main(String[] args) {
//		Set<String> lista = new HashSet<String>();
		SortedSet<String> lista = new TreeSet<String>();
		lista.add("Ana Maria");
		lista.add("Joan Pedro");
		lista.add("Maria Joana");
		
		SortedSet<Double> nums = new TreeSet<Double>();
		nums.add(1.0);
		nums.add(3.4);
		nums.add(8.0);

		for (String candidato : lista) {
			System.out.println(candidato);
		}

		Set<Usuario> u = new HashSet<Usuario>();
		Usuario novoUsuario = new Usuario();
		novoUsuario.setNome("Joan Pedro2");
		novoUsuario.setEmail("any_email2@mail.com");
		Usuario novoUsuario2 = new Usuario();
		novoUsuario2.setNome("Joan Pedro");
		novoUsuario2.setEmail("any_email2@mail.com");

		u.add(novoUsuario);
		u.add(novoUsuario2);
		System.out.println(novoUsuario.getNome());
		
		for(Usuario usuario: u) {
			System.out.println(usuario.getNome());
		}
	}
}
