package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Tipos Numéricos
		byte anosDeEmpresas = 3;
		short numerosDeVoos = 542;
		int id = 56789;
		// Literal Long
		long pontosAcumulados = 5_400_300_321L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.1;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'A';
		String nome = "Joan";
		
		System.out.println(anosDeEmpresas * 365);
		System.out.println(numerosDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": Ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status? " + status + " Nome: " + nome);
	}
}
