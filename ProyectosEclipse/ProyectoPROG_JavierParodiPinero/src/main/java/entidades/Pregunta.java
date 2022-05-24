package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the preguntas database table.
 * 
 */
@Entity
@Table(name="preguntas")
@NamedQuery(name="Pregunta.findAll", query="SELECT p FROM Pregunta p")
public class Pregunta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codpregunta;

	private int nivelconcrecion;

	private String textopreg;

	//bi-directional many-to-one association to Orientador
	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name="codorientador")
	private Orientador Orientador;

	public Pregunta() {
	}

	public int getCodpregunta() {
		return this.codpregunta;
	}

	public void setCodpregunta(int codpregunta) {
		this.codpregunta = codpregunta;
	}

	public int getNivelconcrecion() {
		return this.nivelconcrecion;
	}

	public void setNivelconcrecion(int nivelconcrecion) {
		this.nivelconcrecion = nivelconcrecion;
	}

	public String getTextopreg() {
		return this.textopreg;
	}

	public void setTextopreg(String textopreg) {
		this.textopreg = textopreg;
	}

	public Orientador getOrientador() {
		return this.Orientador;
	}

	public void setOrientador(Orientador Orientador) {
		this.Orientador = Orientador;
	}

	@Override
	public String toString() {
		return "Pregunta "+ codpregunta + ": " + textopreg
				+ "\n NC: " + nivelconcrecion + " - Orientador " + Orientador.getCodorientador() + " (" + Orientador.getUsuario().getNombre() + ")";
	}

}