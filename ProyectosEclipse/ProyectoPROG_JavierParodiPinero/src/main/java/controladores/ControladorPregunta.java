package controladores;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidades.Pregunta;

public class ControladorPregunta {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProyectoPROG_JavierParodiPinero");
	private EntityManager em;
	private Query consulta;

	public void borrarPregunta(Pregunta c) {
		this.em = entityManagerFactory.createEntityManager();
		Pregunta aux = null;
		this.em.getTransaction().begin();
		if (!this.em.contains(c)) {
			aux = this.em.merge(c);
		}
		this.em.remove(aux);
		this.em.getTransaction().commit();
		this.em.close();
	}

	public void modificarPregunta(Pregunta c) {
		this.em = entityManagerFactory.createEntityManager();
		this.em.getTransaction().begin();
		this.em.merge(c);
		this.em.getTransaction().commit();
		this.em.close();

	}

	public void crearPregunta(Pregunta c) {
		this.em = entityManagerFactory.createEntityManager();
		this.em.getTransaction().begin();
		this.em.persist(c);
		this.em.getTransaction().commit();
		this.em.close();
	}

	public Pregunta findByPK(int pk) {
		this.em = entityManagerFactory.createEntityManager();
		Pregunta aux = null;
		this.consulta = em.createNativeQuery("Select * from preguntas where codpregunta = ?", Pregunta.class);
		this.consulta.setParameter(1, pk);
		try {
			aux = (Pregunta) consulta.getSingleResult();
		} catch (NoResultException nre) {	
			aux = null;
		}
		this.em.close();
		return aux;

	}


	public List<Pregunta> findAll() {
		this.em = entityManagerFactory.createEntityManager();
		this.consulta = em.createNamedQuery("Pregunta.findAll");
		List<Pregunta> lista = (List<Pregunta>) consulta.getResultList();
		this.em.close();
		return lista;
	}

}
