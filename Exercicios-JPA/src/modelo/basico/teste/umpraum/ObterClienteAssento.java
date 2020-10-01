package modelo.basico.teste.umpraum;

import infra.DAO;
import infra.protocols.IDAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
	public static void main(String[] args) {
		
		IDAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		Cliente cliente = daoCliente.obterPorID(1L);
		daoCliente.fechar();
		
		System.out.println(cliente.getAssento().getNome());
		System.out.println(cliente.getAssento().getCliente().getNome());
		
		IDAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorID(4L);
		
		System.out.println(assento.getCliente().getNome());
		daoAssento.fechar();
	}
}
