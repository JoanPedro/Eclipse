package excessao.personalizadaB;

import excessao.Aluno;

public class Validar {
	private Validar() {}
	
	public static void aluno(Aluno aluno) throws StringVaziaException, NumeroForaIntervaloExpection {
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo");
		}
		
		if(aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.getNota() < 0 || aluno.getNota() > 10) {
			throw new NumeroForaIntervaloExpection("nota");
		}
	}
}
