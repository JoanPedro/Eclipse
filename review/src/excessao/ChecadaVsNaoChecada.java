package excessao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {

		try {
			geraError1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			geraError2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Fim :)");
	}

	static void geraError1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}

	static void geraError2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
