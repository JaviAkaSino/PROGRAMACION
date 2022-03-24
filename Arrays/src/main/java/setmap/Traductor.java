package setmap;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author javiakasino
 */
public class Traductor {

    private Map<String, String> traduccion;

    public Traductor() {
        this.traduccion = new TreeMap<>();
    }

    public void guardarEntrada(String palabraIngles, String palabraEspaniol) {

        this.traduccion.put(palabraIngles, palabraEspaniol);
    }

    public void borrarEntrada(String palabraIngles, String palabraEspaniol) {

        this.traduccion.remove(palabraIngles, palabraEspaniol);
    }

    public String traducir(String palabraIngles) {

        return this.traduccion.get(palabraIngles);
    }

    //Crea una lista con las palabras en inglés
    public ArrayList<String> listaPalabrasIngles() {

        return new ArrayList<>(traduccion.keySet());
    }

    //Crea una lista con las palabras en español
    public ArrayList<String> listaPalabrasEspaniol() {

        return new ArrayList<>(traduccion.values());
    }

    public void modificarPalabra(String palabraIngles, String palabraEspaniol) {

        traduccion.replace(palabraIngles, palabraEspaniol);
    }

    public void imprimirTraductor() {

        for (String ingles : this.traduccion.keySet()) {

            System.out.printf("Inglés: %s -- Español: %s %n", ingles, traduccion.get(ingles));
        }

        // for( Objeto aux : Array/Lista/Set/Map... )
        /*Mientras haya elementos en lista, va guardando por orden del iterador
       cada uno de los elementos en aux*/
    }

    public void imprimir() {

        for (Map.Entry<String, String> aux : this.traduccion.entrySet()) {

            System.out.println(aux.getKey() + " - " + aux.getValue());
        }
    }
}
