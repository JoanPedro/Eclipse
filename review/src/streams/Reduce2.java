package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Joan", 7.1);
		Aluno a2 = new Aluno("Babi", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Bia", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> isApproves = aluno -> aluno.getNota() >= 7;
		Function<Aluno, Double> onlyNotes = aluno -> aluno.getNota();
		BinaryOperator<Double> sum = (a, b) -> a + b;
		
		alunos.stream().filter(isApproves).map(onlyNotes).reduce(sum).ifPresent(System.out::println);;
	}
}
