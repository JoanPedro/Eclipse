package modelo.umpraum.protocols;

import modelo.umpraum.Assento;

public interface ICliente {
	public Long getId();

	public void setId(Long id);

	public String getNome();

	public void setNome(String nome);

	public IAssento getAssento();

	public void setAssento(Assento assento);
}
