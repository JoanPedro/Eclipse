package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultadoChain = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		int resultadoCompose = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		
		System.out.println(resultadoChain);
		System.out.println(resultadoCompose);
		
	}
}
