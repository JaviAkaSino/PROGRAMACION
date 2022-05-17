/*
 * Clase para mapear los datos de la tabla Persona
 */

package javierparodipinero;

import java.time.LocalDate;


public class PreguntaVO {
    private int codpreg;
    private int codorientador;
    private String textopreg;
    private int nivelconcrecion; 

    
    
    public PreguntaVO(int codpreg, int codorientador, String textopreg, int nivelconcrecion) {
		super();
		this.codpreg = codpreg;
		this.codorientador = codorientador;
		this.textopreg = textopreg;
		this.nivelconcrecion = nivelconcrecion;
	}


    public PreguntaVO(){
        
    }
    
    

    public int getCodpreg() {
		return codpreg;
	}


	public void setCodpreg(int codpreg) {
		this.codpreg = codpreg;
	}


	public int getCodorientador() {
		return codorientador;
	}


	public void setCodorientador(int codorientador) {
		this.codorientador = codorientador;
	}


	public String getTextopreg() {
		return textopreg;
	}


	public void setTextopreg(String textopreg) {
		this.textopreg = textopreg;
	}


	public int getNivelconcrecion() {
		return nivelconcrecion;
	}


	public void setNivelconcrecion(int nivelconcrecion) {
		this.nivelconcrecion = nivelconcrecion;
	}


	@Override
	public String toString() {
		return "PreguntaVO [codpreg=" + codpreg + ", codorientador=" + codorientador + ", textopreg=" + textopreg
				+ ", nivelconcrecion=" + nivelconcrecion + "]";
	}


	
}
