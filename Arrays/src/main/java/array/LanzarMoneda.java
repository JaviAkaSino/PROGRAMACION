package array;

/**
 *
 * @author JaviA
 */
public class LanzarMoneda {

    /*Escribe una clase LanzarMoneda que tenga como único atributo un array 
        de booleanos de tamaño 1000. La clase tendrá los siguientes métodos:*/
    private boolean[] secuencia = new boolean[1000];
    
    public void LanzarMoneda() {

    }

    /*Mejora el ejercicio anterior para que el número de lanzamientos pueda ser 
    variable:
    
    En este caso, sólo tendríamos que declarar secuencia como new 
    booelan[i] y pedir el dato i*/
    public void LanzarMoneda(int veces) {

        secuencia = new boolean[veces];

    }

    /*Un método para rellenar el array, de forma que simule 1000 lanzamientos 
        de una moneda. El método debe almacenar el resultado de cada tirada en el 
        array*/
    public void rellenarArrayCaraCruz() {

        int numero = 0;
        for (int i = 0; i < secuencia.length; i++) {

            boolean caraTCruzF = true; //Es cara mientras no sea cruz

            numero = Utilidades.numeroAleatorioEntre(0, 1);

            if (numero == 0) { //Si es 0, false (cruz)

                caraTCruzF = false;
            }

            secuencia[i] = caraTCruzF;
        }
    }

    /*Un método para saber cuántas “caras” salieron después de los lanzamientos.*/
    public int contarCaras() {

        int caras = 0;

        for (int i = 0; i < secuencia.length; i++) {

            if (secuencia[i]) {

                caras++;
            }
        }

        return caras;
    }

    /*Un método para saber cuántas “cruces” salieron después de los lanzamientos.*/
    public int contarCruces() {

        int cruces = 0;

        for (int i = 0; i < secuencia.length; i++) {

            if (!secuencia[i]) {

                cruces++;
            }
        }

        return cruces;
    }

    /*Un método para imprimir el resultado de los 1000 lanzamientos, de forma 
        que aparezca el número de lanzamiento y el resultado (cara o cruz)*/
    public void mostrarArray() {

        for (int i = 0; i < secuencia.length; i++) {

            String resultado = "Cara"; //Es cara mientras no sea cruz

            if (!secuencia[i]) { //Si false, cruz
                resultado = "Cruz";
            }

            System.out.println("Lanzamiento " + (i + 1) + ": " + resultado);
        }

    }
}
