package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the orientadores database table.
 * 
 */
@Entity
@Table(name="orientadores")
@NamedQuery(name="Orientador.findAll", query="SELECT o FROM Orientador o")
public class Orientador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codorientador;

	private int antiguedad;

	private double salario;

	//bi-directional many-to-one association to Pregunta
	@OneToMany(mappedBy="orientadore")
	private List<Pregunta> preguntas;

	//bi-directional one-to-one association to Usuario
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="coduser")
	private Usuario usuario;

	public Orientador() {
	}

	public int getCodorientador() {
		return this.codorientador;
	}

	public void setCodorientador(int codorientador) {
		this.codorientador = codorientador;
	}

	public int getAntiguedad() {
		return this.antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public List<Pregunta> getPreguntas() {
		return this.preguntas;
	}

	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	public Pregunta addPregunta(Pregunta pregunta) {
		getPreguntas().add(pregunta);
		pregunta.setOrientadore(this);

		return pregunta;
	}

	public Pregunta removePregunta(Pregunta pregunta) {
		getPreguntas().remove(pregunta);
		pregunta.setOrientadore(null);

		return pregunta;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}