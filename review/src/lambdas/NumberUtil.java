package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class NumberUtil {
	
	static public final Function<Integer, String> integerToBinary = integer -> Integer.toBinaryString(integer);
	
	static public final UnaryOperator<String> invertString = string -> new StringBuilder(string).reverse().toString();
	
	static public final Function<String, Integer> binaryToInteger = string -> Integer.parseInt(string, 2);
}
