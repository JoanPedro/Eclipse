package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		usuarios.put(1, "Joan Pedro");
		usuarios.put(20, "Ricardo");
		usuarios.put(4, "Rafaela");
		usuarios.put(3, "Roberta");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());

		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());

		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Joan Pedro"));

		System.out.println(usuarios.get(20));
		System.out.println(usuarios.remove(1));

		for (Integer key : usuarios.keySet()) {
			System.out.println(key);
		}

		for (String value : usuarios.values()) {
			System.out.println(value);
		}
		
		for(Entry<Integer, String> usuario: usuarios.entrySet()) {
			System.out.println(usuario.getKey());
			System.out.println(usuario.getValue());
		}
	}
}
