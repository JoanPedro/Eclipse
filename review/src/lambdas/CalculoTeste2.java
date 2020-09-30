package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		Calculo calculo = (double a, double b) -> {
			return a + b;
		};
		System.out.println(calculo.executar(3, 5));

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
