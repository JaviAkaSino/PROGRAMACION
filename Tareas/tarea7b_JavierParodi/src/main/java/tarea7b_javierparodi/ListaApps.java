
package tarea7b_javierparodi;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JaviA
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaApps {
    
    
    // XmLElementWrapper define un contenedor para la lista de apps
    @XmlElementWrapper(name = "lista_aplicaciones")

    // XmlElement establece el nombre de los elementos
    // Cada elemento de la lista llevará esta etiqueta en el fichero xml
    @XmlElement(name = "aplicacion")
    
    private ArrayList<App> listaAplicaciones;

    public ArrayList<App> getListaAplicaciones() {
        return listaAplicaciones;
    }

    public void setListaAplicaciones(ArrayList<App> listaAplicaciones) {
        this.listaAplicaciones = listaAplicaciones;
    }
    
    
    
}
