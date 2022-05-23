package controladores;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidades.Usuario;

public class ControladorUsuario {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProyectoPROG_JavierParodiPinero");
	private EntityManager em;
	private Query consulta;

	public void borrarUsuario(Usuario c) {
		this.em = entityManagerFactory.createEntityManager();
		Usuario aux = null;
		this.em.getTransaction().begin();
		if (!this.em.contains(c)) {
			aux = this.em.merge(c);
		}
		this.em.remove(aux);
		this.em.getTransaction().commit();
		this.em.close();
	}

	public void modificarUsuario(Usuario c) {
		this.em = entityManagerFactory.createEntityManager();
		this.em.getTransaction().begin();
		this.em.merge(c);
		this.em.getTransaction().commit();
		this.em.close();

	}

	public void crearUsuario(Usuario c) {
		this.em = entityManagerFactory.createEntityManager();
		this.em.getTransaction().begin();
		this.em.persist(c);
		this.em.getTransaction().commit();
		this.em.close();
	}

	public Usuario findByPK(int pk) {
		this.em = entityManagerFactory.createEntityManager();
		Usuario aux = null;
		this.consulta = em.createNativeQuery("Select * from Usuario where coduser = ?", Usuario.class);
		this.consulta.setParameter(1, pk);
		try {
			aux = (Usuario) consulta.getSingleResult();
		} catch (NoResultException nre) {	
			aux = null;
		}
		this.em.close();
		return aux;

	}
	
	public Usuario findByTelefono(String telefono) {
		this.em = entityManagerFactory.createEntityManager();
		Usuario aux = null;
		this.consulta = em.createNativeQuery("Select * from Usuario where telefono = ?", Usuario.class);
		this.consulta.setParameter(1, telefono);
		try {
			aux = (Usuario) consulta.getSingleResult();
		} catch (NoResultException nre) {	
			aux = null;
		}
		this.em.close();
		return aux;

	}

	public List<Usuario> findAll() {
		this.em = entityManagerFactory.createEntityManager();
		this.consulta = em.createNamedQuery("Usuario.findAll");
		List<Usuario> lista = (List<Usuario>) consulta.getResultList();
		this.em.close();
		return lista;
	}

}
