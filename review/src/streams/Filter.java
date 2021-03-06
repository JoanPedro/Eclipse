package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 8.8);
		Aluno a3 = new Aluno("Daniel", 9.7);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Lia", 5.8);
		Aluno a6 = new Aluno("Pedro", 4.8);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> isAproves = aluno -> aluno.getNota() >= 7;
		Function<Aluno, String> show = aluno -> "Parabéns " + aluno.getNome() + "! Você foi aprovado.";

		alunos.stream()
			.filter(isAproves)
			.map(show)
			.forEach(System.out::println);
	}
}
