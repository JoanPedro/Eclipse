package excessao;

public class Aluno {
	public final String nome;
	public final double nota;
	public final boolean bomComportamento;

	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}
	
	Aluno(String nome, double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}

	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}
}
