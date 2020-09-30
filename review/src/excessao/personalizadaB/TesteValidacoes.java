package excessao.personalizadaB;

import excessao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", -8);
			
			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (StringVaziaException | NumeroForaIntervaloExpection e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("\nAluno validado");
		
	}
}
