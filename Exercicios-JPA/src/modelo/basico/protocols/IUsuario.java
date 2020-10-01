package modelo.basico.protocols;

public interface IUsuario {
	public Long getId();

	public void setId(Long id);

	public String getNome();

	public void setNome(String nome);

	public String getEmail();

	public void setEmail(String email);
}
