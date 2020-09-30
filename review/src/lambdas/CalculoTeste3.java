package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		BinaryOperator<Double> calculo = (Double a, Double b) -> {
			return a + b;
		};

		System.out.println(calculo.apply(3.0, 5.0));

		Calculo calculo2;
		calculo2 = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo2.executar(6, 6));

		calculo2 = (x, y) -> x * y;
		System.out.println(calculo2.executar(4, 4));

		System.out.println(calculo2.legal());
		System.out.println(Calculo.muitoLegal());
	}
}
