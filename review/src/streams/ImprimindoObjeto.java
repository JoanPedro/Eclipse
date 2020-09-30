package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjeto {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Bia", "Ana");

		System.out.println("\n Usando Foreach (1)");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}

		System.out.println("\n Usando Foreach (2)");
		for (String aprovado : aprovados) {
			System.out.println(aprovado);
		}
		
		System.out.println("\n Usando Iterator");
		Iterator<String> iterator = aprovados.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\n Usando Stream");
		Stream<String> stream = aprovados.stream();
//		stream.forEach(System.out::println);
		stream.forEach(aprovado -> System.out.println(aprovado));
		
		System.out.println("\n Usando forEach (3)");
		aprovados.forEach(n -> System.out.println(n));
	}
}
