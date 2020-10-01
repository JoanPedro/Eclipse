package modelo.basico.teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoCliente {
	public static void main(String[] args) {
		Assento assento = new Assento("9D");
		Cliente cliente = new Cliente("Joan", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(assento)
			.incluir(cliente)
			.fecharT()
			.fechar();
		
		dao.fechar();
	}
}
