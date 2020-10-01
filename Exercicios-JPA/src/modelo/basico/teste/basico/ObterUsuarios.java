package modelo.basico.teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.protocols.IUsuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

//		String jpql = "select u from Usuario u";
//		TypedQuery<IUsuario> query = em.createQuery(jpql, IUsuario.class);
//		query.setMaxResults(5);
//		List<IUsuario> usuarios = query.getResultList();

		List<IUsuario> usuarios = em
				.createQuery("SELECT u FROM Usuario u", IUsuario.class)
				.setMaxResults(5)
				.getResultList();
		
		usuarios.forEach(usuario -> System.out.println("ID: " + usuario.getId() + " E-mail: " + usuario.getEmail()));


		em.close();
		emf.close();
	}
}
