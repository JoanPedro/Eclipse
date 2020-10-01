package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		IUsuario novoUsuario = new Usuario("Marcelo", "marcelo@lanche.com");

		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
