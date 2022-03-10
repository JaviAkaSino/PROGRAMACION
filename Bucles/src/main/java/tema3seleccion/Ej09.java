
package tema3seleccion;


public class Ej09 {

    public static void main(String[] args) {
        
        int variable=3, variable2;
        
        /*Vale 100 porque variable es 3, y no hay breaks en el switch desde el
        2, por lo que salta directamente al default*/

        switch(variable)
            {

            case 1:
		variable2=5;
		break;
            case 2:
		variable2=20;
		break;
            case 3:
		variable2=30;
            case 4:
		variable2=10;
            default:
		variable2=100;
		break; 
        
            }
            
        System.out.println(variable2);
        
        /*Vale 100 porque variable es 3, y no hay breaks en el switch desde el
        2, por lo que salta directamente al default*/
        
    }
    
}
