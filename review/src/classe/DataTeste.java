package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data = new Data();

		var d2 = new Data(25, 9, 2020);

		data.imprimirDataFormatada();
		d2.imprimirDataFormatada();

		Data novaData = data;
		data.dia = 4;

		novaData.imprimirDataFormatada();
		data.imprimirDataFormatada();
	}
}
