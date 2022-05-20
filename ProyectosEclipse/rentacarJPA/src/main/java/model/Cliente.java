package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@Table(name="cliente")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String apellidos;

	private String nif;

	private String nombre;

	//bi-directional many-to-one association to Alquiler
	@OneToMany(mappedBy="cliente")
	private List<Alquiler> alquilers;

	//bi-directional one-to-one association to TarjetaBancaria
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tarjeta")
	private TarjetaBancaria tarjetaBancaria;

	public Cliente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alquiler> getAlquilers() {
		return this.alquilers;
	}

	public void setAlquilers(List<Alquiler> alquilers) {
		this.alquilers = alquilers;
	}

	public Alquiler addAlquiler(Alquiler alquiler) {
		getAlquilers().add(alquiler);
		alquiler.setCliente(this);

		return alquiler;
	}

	public Alquiler removeAlquiler(Alquiler alquiler) {
		getAlquilers().remove(alquiler);
		alquiler.setCliente(null);

		return alquiler;
	}

	public TarjetaBancaria getTarjetaBancaria() {
		return this.tarjetaBancaria;
	}

	public void setTarjetaBancaria(TarjetaBancaria tarjetaBancaria) {
		this.tarjetaBancaria = tarjetaBancaria;
	}

}