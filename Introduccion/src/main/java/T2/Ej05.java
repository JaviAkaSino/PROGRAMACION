//Nombre del paquete
package T2;

//Aquí irían los imports

//Declaración de la clase
public class Ej05 {

    //Método main
    public static void main(String[] args) {
        
        //Declarar variables primitivas
        
            //Número entero
                //Byte (ocupa 8 bits)
                byte temperatura;
                
                //Short (ocupa 16 bits)
                short cmDeAltura;
                
                //Int (ocupa 32 bits)        
                int distanciaEnKm;
                
                //Long (ocupa 64 bits)
                long segundosDeUnDia;
            
            //Número real 
                //Float (ocupa 32 bits)
                float horasDurmiendo;
                
                //Double (ocupa 64 bits)
                double areaDeUnCirculo; 
                    
            //Caracteres (ocupa 2 bytes)
                char longitud;
            
            //Booleano (ocupa 1 bit)
                boolean esCierto;
            
            
        //Declarar int y double (64 y 32 bits, respectivamente)
        
            int radio = 13;
            
            final double pi = Math.PI;
            
        //Declarar objeto String
        
            String title = "El área del círculo es ";
            
        
        System.out.println("Programa para calcular el área de un círculo");    
        
        //Área = pi * r e 2 = pi * radio * radio
        //Declarar e inicializar la formula del area
        
            double area;
            area = Math.PI * radio * radio;
            
        //Utilizamos la clase System.out.println para enviar el mensaje    
            
            System.out.println("" + title + area);
            
            
            
            
                    
                    
                    
                    
            
                    
             
              
                
    }
    
}
