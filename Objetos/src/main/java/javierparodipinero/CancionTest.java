
package javierparodipinero;

public class CancionTest {
    
    
    public static void main(String[] args) {
        
        Cancion cancion1 = new Cancion("Venom", "Eminem");
        
        Cancion cancion2 = new Cancion("Mi gran noche", "Raphael");
        
        System.out.println(cancion1.getTitulo());
        System.out.println(cancion1.getAutor());
        
        System.out.println(cancion2.toString());
        
        cancion2.setAutor("Estopa");
        cancion2.setTitulo("Fuego");
        
        System.out.println(cancion2.toString());
        
        
        
    }
    
}
