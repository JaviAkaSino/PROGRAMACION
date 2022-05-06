/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7c_javierparodi;

/**
 *
 * @author JaviA
 */
public class HoraClase {
   
    private String curso;
    private String inicialesProfesor;
    private String asignatura;
    private String aula;
    private int diaSemana;
    private int horaDia;

    public HoraClase() {
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInicialesProfesor() {
        return inicialesProfesor;
    }

    public void setInicialesProfesor(String inicialesProfesor) {
        this.inicialesProfesor = inicialesProfesor;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getHoraDia() {
        return horaDia;
    }

    public void setHoraDia(int horaDia) {
        this.horaDia = horaDia;
    }

    @Override
    public String toString() {
        return curso + ";" + inicialesProfesor + ";" + asignatura + ";" + aula + ";" + diaSemana + ";" + horaDia;
    }
    
    
}
