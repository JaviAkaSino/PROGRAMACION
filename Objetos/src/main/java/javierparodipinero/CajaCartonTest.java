
package javierparodipinero;

public class CajaCartonTest {

    public static void main(String[] args) {

  
        CajaCarton cajaGrande = new CajaCarton(250, 400, 500, 200);
        CajaCarton cajaChica = new CajaCarton(25, 30, 15, 17);
        
        
        System.out.println("Caja Grande: ");
        System.out.println("Ancho: " + cajaGrande.getAncho() + " mm");
        System.out.println("Alto: " + cajaGrande.getAlto() + " mm");
        System.out.println("Largo: " + cajaGrande.getLargo() + " mm");
        System.out.println("Peso: " + cajaGrande.getPeso() + " gr");
        
        System.out.println("");
        
        System.out.println("Caja Chico: ");
        System.out.println("Ancho: " + cajaChica.getAncho() + " mm");
        System.out.println("Alto: " + cajaChica.getAlto() + " mm");
        System.out.println("Largo: " + cajaChica.getLargo() + " mm");
        System.out.println("Peso: " + cajaChica.getPeso() + " gr");
        
        System.out.println(cajaGrande.toString());
        
    }
    
}
