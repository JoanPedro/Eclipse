package modelo.basico.protocols;

public interface IProduto {
	public void setId(Long id);
	
	public Long getId();

	public String getNome();

	public void setNome(String nome);

	public Double getPreco();

	public void setPreco(Double preco);
}
