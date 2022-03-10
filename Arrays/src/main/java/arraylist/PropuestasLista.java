package arraylist;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class PropuestasLista {
    
    
    //Atributo encapsulado de tipo lista
    private ArrayList<Propuesta> lista;

    /*Constructor por defecto, solo instancia la estructura
    list sin incluir ningún objeto*/
    public PropuestasLista() {
        this.lista = new ArrayList<>();
    }

    //Guarda una propuesta al final de la lista si no es nulo
    public void insertarPropuesta(Propuesta propuesta) {

        if (propuesta != null) {

            lista.add(propuesta);
        }
    }

    public void imprimirLista() {

        System.out.println("Lista de propuestas: ");

        lista.forEach(System.out::println);

    }

    public int getNumeroPropuestas() {

        return lista.size();
    }

    //Eliminar una propuesta
    public boolean borrarPropuesta(Propuesta propuesta) {
        //Lo busca y devuelve un true si está se borra
        return lista.remove(propuesta); //Usa equals
    }

    //Buscar una propuesta por nombre (cuenta de la vieja)
    public Propuesta buscarNombrePersona(String nombre) {
        
        Propuesta aux = null;
        
        for (int i = 0; i < lista.size(); i++) {
            
            aux = lista.get(i);
            
            if (aux.getNombrePersona().equals(nombre)) {
                
                return aux;
            }
        }
        return aux;
    }

//    //Buscar una propuesta por número de persona (bien)
//    public Propuesta buscarPersonaBien(int numero) {
//
//        Propuesta aux = new Propuesta(numero, "", "");
//
//        int posicion = lista.indexOf(aux); //usa el equals
//
//        if (0 <= posicion) {
//
//            return lista.get(posicion);
//        }
//
//        return null;
//    }

    
    //Saca una lista de las propuestas con la misma fecha
    public ArrayList<Propuesta> buscarPorFecha(LocalDate fecha) {

        ArrayList<Propuesta> listaFecha = new ArrayList();

        for (Propuesta propuesta : this.lista) {

            if (propuesta.getFecha().equals(fecha)) {

                listaFecha.add(propuesta);
            }
        }

        return listaFecha;
    }
    
    //Saca una lista de las propuestas con el mismo sitio
    public ArrayList<Propuesta> buscarPorSitio(String sitio) {

        ArrayList<Propuesta> listaMismaFecha = new ArrayList();

        for (Propuesta propuesta : this.lista) {

            if (propuesta.getSitio().equalsIgnoreCase(sitio)) {

                listaMismaFecha.add(propuesta);
            }
        }

        return listaMismaFecha;
    }
    
    
}
