package javierparodipinero;

import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class CajonCalcetines {

    private ArrayList<Calcetin> cajon;

    /*Constructor por defecto, solo instancia la estructura
    list sin incluir ningún objeto*/
    public CajonCalcetines() {
        this.cajon = new ArrayList<>();
    }

    //Llena el arraylist con entre 10/20 objetos Calcetin
    public void llenarCajon() {

        int cantidad = Calcetin.numeroAleatorioEntre(10, 20);

        for (int i = 0; i < cantidad; i++) {

            this.cajon.add(new Calcetin());
        }
    }

    //Muestra la lista de calcetines (comprobación)
    public void mostrarCajon() {

        System.out.println("Lista de calcetines: ");

        cajon.forEach(System.out::println);
    }

    //Borra un calcetín de la lista
    public boolean borrarCalcetin(Calcetin calcetin) {

        return cajon.remove(calcetin);
    }

    //Busca en la lista la pareja de cada calcetín y, si la encuentra, borra ambos
    public void doblarCalcetines() {

        for (int i = 0; i < cajon.size() - 1; i++) {

            for (int j = i + 1; j < cajon.size(); j++) {

                if (cajon.get(i).equals(cajon.get(j))) { //Si index i y index j son iguales

                    borrarCalcetin(cajon.get(i)); // Se borra index i

                    j--; //Al 'encojer' el array, se le resta 1 a j

                    borrarCalcetin(cajon.get(j)); //Se borra index j

                    i--; //Se le resta 1 a i para recorrer todo el array

                    break; //Se deja de comparar el calcetín emparejado
                }
            }
        }
    }

    //Devuelve un sout diciendo si están todos emparejados o no
    //En caso de que no, también devuelve los no emparejados
    public void todosEmparejados() {

        if (cajon.isEmpty()) { //Si la lista actual está vacía

            System.out.println("EMPAREJADOS"); //No queda ninguno sin pareja

        } else { //En caso contrario, hay calcetiens desemparejados

            System.out.println("DESEMPAREJADOS: ");

            cajon.forEach(System.out::println); //Y se muestran en consola
        }
    }

}
