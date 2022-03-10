//Nombre del paquete
package T2;

//imports
//Decl. clase
public class Ej09 {

    //Método main
    public static void main(String[] args) {
        /*9.- Crea una nueva clase llamada Ej09, que contenga una llamada 
        al método public static void main(String[] args). La aplicación Java 
        contendrá comentarios descriptivos del código y realizará lo siguiente:
	a.- Declara e inicializa dos variables int (a=10,  b=20).
	b.- Declara cuatro variables booleanas.
	c.- Guarda, en las variables booleanas, el resultado de realizar las 
        siguientes operaciones relacionales: a<b, a>b, a==b, a!=b.
	d.- Muestra en pantalla el resultado de las operaciones, usando las 
        variables booleanas.
         */

        //Declaramos e inicializ. a y b
        int a = 10, b = 20;

        //Declaramos 4 variables booleanas
        boolean aMenorB, aMayorB, aIgualB, aDistintoB;

        //Guardamos el resultado de las operaciones
        aMenorB = a < b;
        aMayorB = a > b;
        aIgualB = a == b;
        aDistintoB = a != b;

        //Mostramos en pantalla los resultados
        System.out.println("a < b = " + aMenorB + "\na > b = " + aMayorB
                + "\na == b = " + aIgualB + "\na! = b = " + aDistintoB);

    }

}
