package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.add("O Pequeno príncipe");
		pilha.push("Dom Quixote");
		pilha.push("O Hobbit");
		
		System.out.println(pilha.peek());
		System.out.println(pilha.element());
		
		System.out.println(pilha.poll());
		System.out.println(pilha.pop());
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());
//		System.out.println(pilha.remove());
		
		System.out.println(pilha.size());
		System.out.println(pilha.isEmpty());
		pilha.clear();
	}
}
