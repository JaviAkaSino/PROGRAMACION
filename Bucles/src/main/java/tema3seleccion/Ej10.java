
package tema3seleccion;


public class Ej10 {

    public static void main(String[] args) {
        
        int variable = 3, variable2;      
        
        //Añadimos los breaks
        
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
                break;
            case 4:
		variable2=10;
                break;
            default:
		variable2=100;
		break; 
            }
        
        System.out.println(variable2);
                
    }
    
}
