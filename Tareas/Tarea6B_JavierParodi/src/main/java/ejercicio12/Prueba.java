package ejercicio12;

/**
 *
 * @author javiakasino
 */
public class Prueba {

    public static void main(String[] args) {

        System.out.println("Cuenta corriente y cuenta ahorro con 2000€");
        
        Cuenta c1 = new CuentaCorriente(1000, new Persona());
        c1.setSaldo(2000);
        
        Cuenta c2 = new CuentaAhorro(2, 100, new Persona());
        c2.setSaldo(2000);
        
        System.out.println(c1);
        System.out.println(c2);
        
        System.out.println("Actualizar saldo de ambas");
        
        c1.actualizarSaldo();
        c2.actualizarSaldo();
        
        System.out.println(c1);
        System.out.println(c2);
        
        System.out.println("Retirar 1000€ en ambos");
        
        c1.retirar(1000);
        c2.retirar(1000);
        
        System.out.println(c1);
        System.out.println(c2);
        
        System.out.println("Intentamos bajar del saldo mínimo en c1 y de 0 en c2");

        c1.retirar(100);
        c2.retirar(1000);
        
        System.out.println(c1);
        System.out.println(c2);
        
        
    }
    
}
