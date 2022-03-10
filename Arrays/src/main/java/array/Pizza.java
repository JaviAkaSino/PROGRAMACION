/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package array;

/**
 *
 * @author javiakasino
 */

//COnstructor en privado
//No hay setter
//Recomendable atributos final
//Se definen los objetos al principio del enum
public enum Pizza {

    BARBACOA(12, "Barbacoa Cream", new String[]{"Carne", "Bacon", "Queso", "Huevo"}, 13.0),
    CARBONARA(14, "Carbonara", new String[]{"Nata", "Bacon", "Queso", "Champiñones"}, 13.0),
    JAMONYQUESO(14, "Carbonara", new String[]{"Nata", "Bacon", "Queso", "Champiñones"}, 13.0);

    private final int tamanio;
    private final String nombre;
    private final String[] ingredientes;
    private final double precio;

    private Pizza(int tamanio, String nombre, String[] ingredientes, double precio) {

        this.tamanio = tamanio;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

}
