package setmap;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 *
 * @author JaviA
 */
public class Loteria {

    private Map<String, String> loteria;

    //Crea el map vacío
    public Loteria() {
        this.loteria = new TreeMap<>();
    }

    //Constructor que pide el número de décimos y crea en proporción
    public Loteria(int cantidadNumeros) {

        //Crea el map
        this.loteria = new TreeMap<>();

        //Guarda los premios gordos
        guardarNumeroPremiado("Primer premio: 1.000.000€");
        guardarNumeroPremiado("Segundo premio: 500.000€");
        guardarNumeroPremiado("Tercer premio: 100.000€");

        //Guarda un 1% del total de números con un reintegro
        for (int i = 0; i < cantidadNumeros / 100; i++) {

            guardarNumeroPremiado("Reintegro: 5€");
        }

        //Llena hasta el número indicado(no se usa for por si repite número
        do {

            guardarNumeroNoPremiado();

        } while (loteria.size() < cantidadNumeros); //Hasta que la cantidad sea la indicada

    }

    //Crea número de lotería aleatorio
    public static String numeroLoteriaRandom() {

        Random rnd = new Random();
        String num = "0123456789";
        String numero = "";
        char digito;
        for (int i = 0; i < 5; i++) {

            digito = num.charAt(rnd.nextInt(10));

            numero += Character.toString(digito);
        }

        return numero;
    }

    //Guarda un número del que se indica el premio
    public void guardarNumeroPremiado(String premio) {

        this.loteria.put(numeroLoteriaRandom(), premio);

    }

    //Guarda un número no premiado
    public void guardarNumeroNoPremiado() {

        this.loteria.put(numeroLoteriaRandom(), "No premiado");

    }

    public String consultarPremio(String numero) {

        return this.loteria.get(numero);
    }
    
    public void mostrarNumeros(){
        
        int posicion = 1;
        
        for (String numero : this.loteria.keySet()){
            
            System.out.println("Número " + posicion++ + ": " + numero + " - " + this.consultarPremio(numero));
        }

    }

}
