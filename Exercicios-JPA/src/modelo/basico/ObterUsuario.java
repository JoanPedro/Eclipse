package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		IUsuario usuarioExistente = em.find(Usuario.class, 6L);
		System.out.println(usuarioExistente.getNome());

		em.getTransaction().begin();
		em.persist(usuarioExistente);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
