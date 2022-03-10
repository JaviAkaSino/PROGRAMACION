package javierparodipinero;

public class Ej1 {

    public static void main(String[] args) {

        int x = 2;
        
        //Bucle: Mientras x sea menor que 100, saco x y le añado un guión
        //Despues sumamos 1 (x++). Cuando x=101, se parará
        
        while (x <= 100) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
        
        //Aquí x = 101
    }

}
