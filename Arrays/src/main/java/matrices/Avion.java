package matrices;

/**
 *
 * @author javiakasino
 */
public class Avion {

    public static void main(String[] args) {

        /*Crear un programa que mediante un menú permita reservar o cancelar 
        asientos de un avión, así como mostrar qué asientos están ocupados y 
        libres actualmente. El avión tendrá 25 filas de 4 asientos cada una.*/     
        
        boolean[][] avion = new boolean[25][4]; //Se crea el avión
        vaciarPlazas(avion); //Se ponen todas las plazas en disponible (true)

        int opcion = 0, fila = 0, columna = 0, i = 0, j = 0;
        
        System.out.println("MENÚ DE RESERVAS\n");
        System.out.println("****************\n");
        
        do{
            System.out.println("Elige una opción:\n");
            System.out.println("1 - Ver disponibilidad");
            System.out.println("2 - Reservar asiento");
            System.out.println("3 - Cancelar reserva");
            System.out.println("4 - Salir");
            
            opcion = Utilidades.escanearInt();
            
            switch(opcion){
                
                case 1:
                    
                    System.out.println("Plazas disponibles:\n");
                    imprimirPlazas(avion);
                    
                    break;
                
                case 2:
                    
                    System.out.println("¿Cuántos asientos desea reservar?");
                    int numeroAsientos = Utilidades.escanearInt();
                    
                    for (int k = 0; k < numeroAsientos; k++) {
                        
                        System.out.println("Introduce la fila");
                        fila = Utilidades.escanearInt();
                        i = fila - 1;
                        System.out.println("Introduce la columna");
                        columna = Utilidades.escanearInt();
                        j= columna - 1;
                    
                    
                        try{
                        
                            if(comprobarPlaza(avion, i, j)){
                        
                                System.out.println("Ha reservado la plaza " + fila
                                    + columna +"\n");
                        
                                    avion[i][j] = false;
                                } else {
                        
                                    System.out.println("La plaza " + fila + columna + 
                                        " está ocupada, pruebe con otra opción\n");
                                }
                        
                        } catch(ArrayIndexOutOfBoundsException aioobe){
                        
                                System.out.println("Asiento no válido, pruebe otra opción\n");
                        
                        }
                        
                    }

                    break;
                    
                case 3:
                    
                    System.out.println("¿Cuántas reservas desea cancelar?");
                    numeroAsientos = Utilidades.escanearInt();
                    
                    for (int k = 0; k < numeroAsientos; k++) {
                        
                        System.out.println("Introduce la fila");
                        fila = Utilidades.escanearInt();
                        System.out.println("Introduce la columna");
                        columna = Utilidades.escanearInt();
                    
                        try {
                            
                            if(!comprobarPlaza(avion, i, j)){
                        
                                System.out.println("Ha cancelado la reserva de la plaza " 
                                    + fila + columna +"\n");
                        
                                avion[i][j] = true;
                            
                            } else {
                        
                                System.out.println("La plaza " + fila + columna + 
                                " está libre, pruebe con otra opción\n");
                            }
                            
                        } catch(ArrayIndexOutOfBoundsException aioobe){
                        
                            System.out.println("Asiento no válido, pruebe otra opción\n");                  
                        }
                    }
                    
                    break;
                    
                case 4:
                    
                    System.out.println("¡Hasta pronto!");
                    break;
                    
                default:
                    
                    System.out.println("Opción no válida\n");
                    
                    break;
    
            }
            
        } while (opcion!=0);       
        
    }

    public static void vaciarPlazas(boolean[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = true;
            }

        }
    }

    public static void imprimirPlazas(boolean[][] matriz) {

        System.out.print("\t");
        for (int j = 0; j < matriz[j].length; j++) {
            System.out.print("Columna " + (j+1) + " ");
        }

        System.out.println("\n");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Fila " + (i+1) + ": \t");
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == true) {
                    System.out.print("O\t");
                } else {

                    System.out.print("X\t");
                }
            }

            System.out.println("\n");
        }
    }
    
    //Devuelve si la plaza está disponible (true) u ocupada (false)
    public static boolean comprobarPlaza(boolean[][] matriz, int i, int j){
       
        return matriz[i][j];  
    }

}
