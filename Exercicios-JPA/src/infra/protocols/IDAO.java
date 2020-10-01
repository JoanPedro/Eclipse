package infra.protocols;

import java.util.List;

public interface IDAO<E> {
	public IDAO<E> abrirT();

	public IDAO<E> fecharT();

	public IDAO<E> incluir(E entidade);

	public IDAO<E> incluirAtomico(E entidade);

	public List<E> obterTodos(int qtde, int deslocamento);

	public List<E> obterTodos();

	public void fechar();

	public E obterPorID(Object id);
}
