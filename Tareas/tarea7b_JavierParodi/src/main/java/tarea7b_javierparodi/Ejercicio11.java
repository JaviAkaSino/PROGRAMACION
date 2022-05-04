package tarea7b_javierparodi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author javiakasino
 */
public class Ejercicio11 {

    public static void main(String[] args) throws JAXBException, IOException {

        //En el método main() de una clase de prueba realiza lo siguiente:
        /*Crea 50 aplicaciones usando el constructor por defecto, guárdalas en una 
    lista y muéstralas por pantalla
    .*/
        ArrayList<App> lista = crearLista(50);

        imprimirLista(lista);

        ///////////////////////////////////////////////////////////////////////
        /*Guarda los datos de todas las App de la lista, en un fichero de texto 
    llamado aplicacionestxt.txt, dentro del directorio “./appstxt”.*/
        metodos.Directorios.crearDirectorio("./appstxt");

        metodos.Escritura.escribirListaAppTxt(lista, "./appstxt/aplicacionestxt.txt");

        ///////////////////////////////////////////////////////////////////////
        /*Guarda los datos de todas las App de la lista, en un fichero XML llamado 
        aplicacionesxml.xml, dentro del directorio “./appsxml”.*/
        metodos.Directorios.crearDirectorio("./appsxml");

        // Se preparan los objetos a utilizar, en esta caso una lista de apps
        ListaApps aplicaciones = new ListaApps();
        aplicaciones.setListaAplicaciones(lista);

        // Crea el contexto JAXB. Se encarga de definir los objetos 
        // que vamos a guardar. En nuestro caso sólo el tipo ListaApps
        JAXBContext contexto = JAXBContext.newInstance(ListaApps.class);

        // El contexto JAXB permite crear un objeto Marshaller, que sirve para
        // generar la estructura del fichero XML 
        // El proceso de pasar objetos Java (ListaApps) a ficheros XML 
        // se conoce como "marshalling" o "serialización"
        Marshaller serializador = contexto.createMarshaller();

        // Especificamos que la propiedad del formato de salida
        // del serializador sea true, lo que implica que el formato se 
        // realiza con indentación y saltos de línea
        serializador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Llamando al método de serialización marshal (sobrecargado) se pueden
        // serializar objetos java en formato XML y volcarlos donde necesitemos:
        // consola, ficheros. El proceso consiste en que el contexto es el 
        // encargo de leer los objetos java, pasarlos al serializador y éste 
        // crear la salida de serialización
        // Serialización y salida por consola
        serializador.marshal(aplicaciones, System.out);

        // Volcado al fichero xml
        serializador.marshal(aplicaciones, new File("./appsxml/aplicacionesxml.xml"));

        ///////////////////////////////////////////////////////////////////////
        /*Guarda los datos de todas las App de la lista, en un fichero JSON llamado 
        aplicacionesjson.json, dentro del directorio “./appsjson”.*/
        metodos.Directorios.crearDirectorio("./appsjson");

        ObjectMapper mapeador = new ObjectMapper();

        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        // Escribe en un fichero JSON la lista de aplicaciones
        mapeador.writeValue(new File("./appsjson/aplicacionesjson.json"), lista);

        ///////////////////////////////////////////////////////////////////////
        /*Crea una carpeta “./copias” y realiza una copia de los ficheros anteriores 
        dentro de ella.*/
        metodos.Directorios.crearDirectorio("./copias");

        metodos.Directorios.copiarArchivos("./appstxt/aplicacionestxt.txt", "./copias/aplicacionestxt.txt");
        metodos.Directorios.copiarArchivos("./appsxml/aplicacionesxml.xml", "./copias/aplicacionesxml.xml");
        metodos.Directorios.copiarArchivos("./appsjson/aplicacionesjson.json", "./copias/aplicacionesjson.json");

        ///////////////////////////////////////////////////////////////////////
        /*En una carpeta “./aplicaciones” crea un archivo de texto por cada aplicación
        que haya en la lista. El archivo se llamará igual que la app y contendrá 
        los datos de la aplicación, separando los campos por el carácter (;).*/
        metodos.Directorios.crearDirectorio("./aplicaciones");

        metodos.Escritura.escribirAplicacionesTxt(lista, "./aplicaciones");

    }

    public static ArrayList<App> crearLista(int numero) {

        ArrayList<App> lista = new ArrayList<>();

        for (int i = 0; i < numero; i++) {

            lista.add(new App());

        }

        return lista;
    }

    public static void imprimirLista(ArrayList<App> lista) {

        for (App a : lista) {

            System.out.println(a);
        }

    }
}
