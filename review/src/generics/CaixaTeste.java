package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		
		Caixa<Double> caixaA = new Caixa<>();
		caixaA.guardar(2.3);
		Double coisaA = caixaA.abrir();
		System.out.println(coisaA);
	}
}
