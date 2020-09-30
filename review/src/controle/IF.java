package controle;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if (media >= 7.0 && media <= 10) {
			System.out.println("Aprovado");
		} else {

		}
		
		entrada.close();
	}
}
