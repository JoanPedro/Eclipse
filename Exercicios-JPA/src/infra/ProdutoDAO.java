package infra;

import modelo.basico.protocols.IProduto;

public class ProdutoDAO extends DAO<IProduto> {

	public ProdutoDAO() {
		super(IProduto.class);
	}
}
