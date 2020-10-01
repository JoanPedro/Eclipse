package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlteraUsuario3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		IUsuario usuario = em.find(Usuario.class, 7L);

		usuario.setNome("JoanPwdd");
		usuario.setEmail("jwdd@email.com");

		em.detach(usuario);
		em.merge(usuario);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
