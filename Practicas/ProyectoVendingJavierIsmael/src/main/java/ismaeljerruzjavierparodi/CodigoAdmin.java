
package ismaeljerruzjavierparodi;

import java.util.Random;

public class CodigoAdmin {
    
    private final String CODIGO;
    private static Random rnd = new Random();
    
    public CodigoAdmin(){
    String minus, mayus, num, simb, todo;
    minus = "abcdefghijklmnopqrstuvwxyz";
    mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    num = "0123456789";
    simb = "#$%&()*+,-.:;<=>@";
    todo = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789#$%&()*+,-.:;<=>@";
    
    char uno = minus.charAt(rnd.nextInt(26));
    char dos = mayus.charAt(rnd.nextInt(26));
    char tres = num.charAt(rnd.nextInt(10));
    char cuatro = simb.charAt(rnd.nextInt(17));
    char cinco = todo.charAt(rnd.nextInt(80));
    char seis = todo.charAt(rnd.nextInt(80));
    char siete = todo.charAt(rnd.nextInt(80));
    char ocho = todo.charAt(rnd.nextInt(80));
    
     this.CODIGO = Character.toString(uno)+Character.toString(dos)+Character.toString(tres)+
           Character.toString(cuatro)+Character.toString(cinco)+Character.toString(seis)+
            Character.toString(siete)+Character.toString(ocho);  
    }

    public String getCODIGO() {
        return CODIGO;
    }

    @Override
    public String toString() {
        return "Codigo de administrador: " + CODIGO;
    }
}
