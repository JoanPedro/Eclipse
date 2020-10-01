package modelo.basico.teste.basico;

import infra.DAO;
import infra.protocols.IDAO;
import modelo.basico.Produto;
import modelo.basico.protocols.IProduto;

public class NovoProduto {
	public static void main(String[] args) {
		
		IDAO<IProduto> dao = new DAO<>(IProduto.class);
		IProduto produto = new Produto("Monitor 23'", 789.98);
		
//		dao.abrirT().incluir(produto).fecharT().fechar();
		dao.incluirAtomico(produto).fechar();
		
		System.out.println("ID do produto: " + produto.getId());
	}
}
