package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import lambdas.NumberUtil;

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Consumer<Integer> println = System.out::println;

		/*
		 * 1. Número para string binária... 6 => "110"; 2. Inverter a string... "110" =>
		 * "011"; 3. Converter de volta para inteiro => "011" => 3
		 */

		System.out.println("\n1 Stream");
		Stream<Integer> numbers2 = numbers.stream().map(NumberUtil.integerToBinary).map(NumberUtil.invertString).map(NumberUtil.binaryToInteger);
		numbers2.forEach(println);

		System.out.println("\nForeach");
		numbers.forEach(n -> System.out.println(n));

		System.out.println("\nForeach 2");
		numbers.forEach(System.out::println);

		System.out.println("\n2 Stream");
		numbers.stream().forEach(n -> System.out.println(n));

		System.out.println("\n2 Stream");
		numbers.stream().forEach(System.out::println);
	}
}
