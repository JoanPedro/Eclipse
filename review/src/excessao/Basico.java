package excessao;

public class Basico {
	public static void main(String[] args) {
		try {
			Aluno a1 = null;
			imprimirNomeAluno(a1);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário: " + e.getMessage());
		}

		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}

		System.out.println("Fim :)");
	}

	static public void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
