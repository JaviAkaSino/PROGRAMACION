/*
 * Clase para mapear los datos de la tabla Pregunta
 */

package javierparodipinero;


public class PreguntaVO {
    private int codpregunta;
    private int codorientador;
    private String textopreg;
    private int nivelconcrecion; 

    
    
    public PreguntaVO(int codpregunta, int codorientador, String textopreg, int nivelconcrecion) {
		super();
		this.codpregunta = codpregunta;
		this.codorientador = codorientador;
		this.textopreg = textopreg;
		this.nivelconcrecion = nivelconcrecion;
	}


    public PreguntaVO(){
        
    }
    
    

    public int getCodpregunta() {
		return codpregunta;
	}


	public void setCodpregunta(int codpregunta) {
		this.codpregunta = codpregunta;
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
		return "PreguntaVO [codpregunta=" + codpregunta + ", codorientador=" + codorientador + ", textopreg=" + textopreg
				+ ", nivelconcrecion=" + nivelconcrecion + "]";
	}


	
}
