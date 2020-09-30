package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	public static void main(String[] args) {

		BinaryOperator<Double> media = (Double a, Double b) -> (a + b) / 2;
		BiFunction<Double, Double, String> resultado = (Double n1, Double n2) -> {
			Double notaFinal = ((n1 + n2) / 2);
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};

		System.out.println(media.apply(9.7, 5.2));
		System.out.println(resultado.apply(9.7, 5.2));

		Function<Double, String> conceito = nota -> nota >= 7 ? "Aprovado" : "Reprovado";

		System.out.println(media.andThen(conceito).apply(9.7, 5.7));
	}
}
