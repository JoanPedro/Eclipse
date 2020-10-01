package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		IUsuario novoUsuario = new Usuario("Carla Beatriz", "carla@lanche.com");

		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();

		System.out.println("O novo usuário tem o ID: " + novoUsuario.getId());
		
		em.close();
		emf.close();
	}
}
