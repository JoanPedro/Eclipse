package modelo.basico.teste.umpramuitos;

import infra.DAO;
import infra.protocols.IDAO;
import modelo.umpramuitos.Pedido;

public class ObterPedido {
	public static void main(String[] args) {
		IDAO<Pedido> dao = new DAO<>(Pedido.class);

		Pedido pedido = dao.obterPorID(1L);

		pedido.getItens().stream().forEach(itemPedido -> {
			System.out.println(itemPedido.getQuantidade());
			System.out.println(itemPedido.getProduto().getNome());
		});

		dao.fechar();
	}
}
