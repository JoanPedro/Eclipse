package modelo.basico.teste.consulta;

import java.util.List;

import infra.DAO;
import infra.protocols.IDAO;
import modelo.muitospramuitos.Filme;

public class ObterFilmes {
	public static void main(String[] args) {
		IDAO<Filme> dao = new DAO<>(Filme.class);
		List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.6);
		
		filmes.forEach(filme -> {
			System.out.println(filme.getNome() + " =>" + filme.getNota());
			
			filme.getAtores().forEach(ator -> {
				System.out.println(ator.getNome());
			});
		});
	}
}
