package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(1));

		String s = "Boa tarde";

		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.compareToIgnoreCase("boa tarde"));

		var nome = "Joan";
		var sobrenome = "de Souza";
		var idade = 33;
		var salario = 12345.987;

		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome);
		System.out.printf("O Sr. %s %s tem %d anos e ganha %.2f.", nome, sobrenome, idade, salario);

		String frase = String.format("O Sr. %s %s tem %d anos e ganha %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);

		System.out.println("Teste");

		String fraseQualquer = "Frase qualquer";
		System.out.println(fraseQualquer.contains("qual"));
		System.out.println(fraseQualquer.indexOf("qual"));
		System.out.println(fraseQualquer.substring(6));
		System.out.println(fraseQualquer.substring(6, 10));
	}
}
