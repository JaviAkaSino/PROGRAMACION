/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Objects;

/**
 *
 * @author javiakasino
 */
public class Estadistica {

    private String codigoPostal, municipio;
    private double p2016, p2015, p2014, p2013, p2011, p2010, p2006, p2001, p1996;

    public Estadistica() {
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public double getP2016() {
        return p2016;
    }

    public void setP2016(double p2016) {
        this.p2016 = p2016;
    }

    public double getP2015() {
        return p2015;
    }

    public void setP2015(double p2015) {
        this.p2015 = p2015;
    }

    public double getP2014() {
        return p2014;
    }

    public void setP2014(double p2014) {
        this.p2014 = p2014;
    }

    public double getP2013() {
        return p2013;
    }

    public void setP2013(double p2013) {
        this.p2013 = p2013;
    }

    public double getP2011() {
        return p2011;
    }

    public void setP2011(double p2011) {
        this.p2011 = p2011;
    }

    public double getP2010() {
        return p2010;
    }

    public void setP2010(double p2010) {
        this.p2010 = p2010;
    }

    public double getP2006() {
        return p2006;
    }

    public void setP2006(double p2006) {
        this.p2006 = p2006;
    }

    public double getP2001() {
        return p2001;
    }

    public void setP2001(double p2001) {
        this.p2001 = p2001;
    }

    public double getP1996() {
        return p1996;
    }

    public void setP1996(double p1996) {
        this.p1996 = p1996;
    }
    
    public double getPromedio(){
        
        return (p2016 + p2015 + p2014 + p2013 + p2011 + p2010 + p2006 + p2001 + p1996) / 9;
    }

    @Override
    public String toString() {

        return municipio + ";" + p1996 + ";" + p2001 + ";" + p2006 + ";" + p2010 + 
                ";" + p2011 + ";" + p2013 + ";" + p2014 + ";" + p2015 + ";" + 
                p2016 + ";" + getPromedio();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.codigoPostal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estadistica other = (Estadistica) obj;
        return Objects.equals(this.codigoPostal, other.codigoPostal);
    }

}
