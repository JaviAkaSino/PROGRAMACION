package controladores;

import java.util.List;

import javax.persistence.*;

import entidades.Orientador;

public class ControladorOrientador {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProyectoPROG_JavierParodiPinero");
	private EntityManager em;
	private Query consulta;

	public void borrarOrientador(Orientador c) {
		this.em = entityManagerFactory.createEntityManager();
		Orientador aux = null;
		this.em.getTransaction().begin();
		if (!this.em.contains(c)) {
			aux = this.em.merge(c);
		}
		this.em.remove(aux);
		this.em.getTransaction().commit();
		this.em.close();
	}

	public void modificarOrientador(Orientador c) {
		this.em = entityManagerFactory.createEntityManager();
		this.em.getTransaction().begin();
		this.em.merge(c);
		this.em.getTransaction().commit();
		this.em.close();

	}

	public void crearOrientador(Orientador c) {
		this.em = entityManagerFactory.createEntityManager();
		this.em.getTransaction().begin();
		this.em.persist(c);
		this.em.getTransaction().commit();
		this.em.close();
	}

	public Orientador findByPK(int pk) {
		this.em = entityManagerFactory.createEntityManager();
		Orientador aux = null;
		this.consulta = em.createNativeQuery("Select * from orientadores where codorientador = ?", Orientador.class);
		this.consulta.setParameter(1, pk);
		try {
			aux = (Orientador) consulta.getSingleResult();
		} catch (NoResultException nre) {	
			aux = null;
		}
		this.em.close();
		return aux;

	}
	
	public Orientador findByCoduser(String coduser) {
		this.em = entityManagerFactory.createEntityManager();
		Orientador aux = null;
		this.consulta = em.createNativeQuery("Select * from orientadores where coduser = ?", Orientador.class);
		this.consulta.setParameter(1, coduser);
		try {
			aux = (Orientador) consulta.getSingleResult();
		} catch (NoResultException nre) {	
			aux = null;
		}
		this.em.close();
		return aux;

	}

	public List<Orientador> findAll() {
		this.em = entityManagerFactory.createEntityManager();
		this.consulta = em.createNamedQuery("Orientador.findAll");
		List<Orientador> lista = (List<Orientador>) consulta.getResultList();
		this.em.close();
		return lista;
	}

}
