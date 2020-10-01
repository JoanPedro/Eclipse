package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoverUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		IUsuario usuario = em.find(Usuario.class, 7L);

		if (usuario != null) {
			em.getTransaction().begin();

			em.remove(usuario);

			em.getTransaction().commit();
		}

		em.close();
		emf.close();
	}
}
