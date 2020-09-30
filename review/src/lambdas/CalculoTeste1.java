package lambdas;

public class CalculoTeste1 {
	public static void main(String[] args) {
		
		Calculo soma = new Somar();
		Calculo multiplicacao = new Multiplicar();
		
		System.out.println(soma.executar(2, 3));
		System.out.println(multiplicacao.executar(2, 3));
		
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(3, 3));
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(3, 3));
		System.out.println(Multiplicar.multiplicar(5, 5));
	}
}
