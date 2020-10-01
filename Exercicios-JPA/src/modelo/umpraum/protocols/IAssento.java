package modelo.umpraum.protocols;

import modelo.umpraum.Cliente;

public interface IAssento {
	public Long getId();

	public void setId(Long id);

	public String getNome();

	public void setNome(String nome);

	public Cliente getCliente();
}
