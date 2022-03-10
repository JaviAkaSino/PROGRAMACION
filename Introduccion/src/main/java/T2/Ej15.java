
package T2;

public class Ej15 {

    public static void main(String[] args) {

/*15.- Indica si el siguiente código funciona o no. En caso afirmativo indica 
        que hace, en caso negativo explica por qué no funciona.
        
	a.- 	boolean adivina = ((97 == 'a') && true);
		System.out.println(adivina);

	b.- 	int a = 'a';
		System.out.println(a);

	c.- 	int pi = 3.14;
		System.out.println(pi);
        	
        d.-	double pi = 3,14;
		System.out.println(pi);

	e.- 	boolean adivina = (1==4);
		System.out.println(adivina);*/


        /*a) Lo que hace es comparar si a es 97 en ASCI, y es true*/
            //boolean adivina = ((97 == 'a') && true);
            //System.out.println(adivina);

        /*b) Inicializa a y lo imprime en consola*/
            //int a = 'a';
            //System.out.println(a);

        /*c) No puedes inicializar un int con un double (int pi = 3.14;)*/ 	
            //double pi = 3.14;
            //System.out.println(pi);    
            
        /*d) No se utiliza la coma, sino punto (double pi = 3,14;)*/
            //double pi = 3.14;
            //System.out.println(pi);
        
        /*e) False porque 1 no es igual a 4*/
            boolean adivina = (1==4);
            System.out.println(adivina);
            
    }
    
}
