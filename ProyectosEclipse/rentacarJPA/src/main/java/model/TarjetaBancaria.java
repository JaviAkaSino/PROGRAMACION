package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tarjeta_bancaria database table.
 * 
 */
@Entity
@Table(name="tarjeta_bancaria")
@NamedQuery(name="TarjetaBancaria.findAll", query="SELECT t FROM TarjetaBancaria t")
public class TarjetaBancaria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int csv;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_caducidad")
	private Date fechaCaducidad;

	private String numero;

	//bi-directional one-to-one association to Cliente
	@OneToOne(mappedBy="tarjetaBancaria", fetch=FetchType.LAZY)
	private Cliente cliente;

	public TarjetaBancaria() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCsv() {
		return this.csv;
	}

	public void setCsv(int csv) {
		this.csv = csv;
	}

	public Date getFechaCaducidad() {
		return this.fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}