package modelo.basico.teste.heranca;

import infra.DAO;
import infra.protocols.IDAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {
	public static void main(String[] args) {
		IDAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno aluno1 = new Aluno(123L, "Joan Pedro");
		AlunoBolsista aluno2 = new AlunoBolsista(345L, "Maria", 1200);
		
		alunoDAO.incluirAtomico(aluno1);
		alunoDAO.incluirAtomico(aluno2);
		
		alunoDAO.fechar();
	}
}
