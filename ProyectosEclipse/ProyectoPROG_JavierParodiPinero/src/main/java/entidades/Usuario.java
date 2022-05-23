package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int coduser;

	private String email;

	private String nombre;

	private String residencia;

	private String telefono;

	public Usuario() {
	}

	public int getCoduser() {
		return this.coduser;
	}

	public void setCoduser(int coduser) {
		this.coduser = coduser;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getResidencia() {
		return this.residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		if(telefono.length()<=12) {
			this.telefono = telefono;
		}	
	}

	@Override
	public String toString() {
		return "Usuario [coduser=" + coduser + ", email=" + email + ", nombre=" + nombre + ", residencia=" + residencia
				+ ", telefono=" + telefono + "]";
	}

}