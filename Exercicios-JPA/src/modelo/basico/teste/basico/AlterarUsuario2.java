package modelo.basico.teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;
import modelo.basico.protocols.IUsuario;

public class AlterarUsuario2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		IUsuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("JoanPw");
		usuario.setEmail("jw@email.com");

		em.getTransaction().begin();
//		em.merge(usuario);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
