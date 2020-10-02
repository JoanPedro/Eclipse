package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import infra.protocols.IDAO;

public class DAO<E> implements IDAO<E> {

	private static EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private Class<E> classe;

	static {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) {
			// Logar -> Log4J
		}
	}

	public DAO() {
		this(null);
	}

	public DAO(Class<E> classe) {
		this.entityManager = entityManagerFactory.createEntityManager();
		this.classe = classe;
	}

	public IDAO<E> abrirT() {
		entityManager.getTransaction().begin();
		return this;
	}

	public IDAO<E> fecharT() {
		entityManager.getTransaction().commit();
		return this;
	}

	public IDAO<E> incluir(E entidade) {
		entityManager.persist(entidade);
		return this;
	}

	public IDAO<E> incluirAtomico(E entidade) {
		entityManager.persist(entidade);
		return this.abrirT().incluir(entidade).fecharT();
	}

	public E obterPorID(Object id) {
		return entityManager.find(this.classe, id);
	}

	public List<E> obterTodos(int qtde, int deslocamento) {
		if (this.classe == null) {
			throw new UnsupportedOperationException("Operação não suportada: Classe nula");
		}

		String jpql = "SELECT todos FROM " + this.classe.getName() + " todos";
		TypedQuery<E> query = entityManager.createQuery(jpql, this.classe);
		query.setMaxResults(qtde);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}

	public List<E> obterTodos() {
		return this.obterTodos(10, 0);
	}

	public List<E> consultar(String nomeConsulta, Object... params) {
		TypedQuery<E> query = entityManager.createNamedQuery(nomeConsulta, this.classe);
		for (int i = 0; i < params.length; i += 2) {
			query.setParameter(params[i].toString(), params[i+1]);
		}
		return query.getResultList();
	}
	
	public E consultarUm(String nomeConsulta, Object... params) {
		List<E> lista = this.consultar(nomeConsulta, params);
		return lista.isEmpty() ? null : lista.get(0);
	}
	
	public void fechar() {
		entityManager.close();
	}
}
