/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searranca;

/**
 *
 * @author JaviA
 */
public abstract class Vehiculo implements SeArranca, SePara, Comparable<Vehiculo> {

    private String matricula;

    public abstract void repostar(String tipoCombustible);

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public Vehiculo() {
    }
    
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + '}';
    }

    /*Al implementar la interface esta clase debería dar código a arrancar, pero 
    al ser abstracta puede dejar que lo hagan las clases hijas; por ejemplo, si 
    las hijas arrancaran de forma diferente*/
//    public boolean arrancar() {
//
//        System.out.println("El vehículo ha arrancado...");
//        return true;
//    }
    
    public boolean parar(){
        
        System.out.println("El ordenador ha arrancado...");
        return true;
    }

    
    public int compareTo(Vehiculo v){
        
        return this.matricula.compareTo(v.matricula);
    }
}
