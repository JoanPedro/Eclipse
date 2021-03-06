package classe;

public class Data {

	int dia = 1;
	int mes = 1;
	int ano = 1970;
	
	Data () {
		this(1, 1, 1970); // Chama o construtor de Data com 3 parâmetros.
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
