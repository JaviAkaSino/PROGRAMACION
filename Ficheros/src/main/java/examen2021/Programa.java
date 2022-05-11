package examen2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 *
 * @author JaviA
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<String, String> mapModulos = LecturaCSV.mapModulos("./nombresModulos.csv");
        System.out.println(mapModulos);
        
        ArrayList<RegistroJSON> listaReg = LecturaJSON.leerJSON("./calificacionesGrupo.json");
        System.out.println(listaReg);

        ArrayList<Alumnado> listaAlumnado = RegistrosToAlumnado.regToAlum(listaReg);
        Collections.sort(listaAlumnado);
        
       
        for (Alumnado alumnado : listaAlumnado) {       
            System.out.println(alumnado);
            
        }

        for (Alumnado alumnado : listaAlumnado) {
            if (alumnado.getNombre().contains("Delia")){
                
                AlumnadoToCSV.alumnoTSV(alumnado, mapModulos);
                
            }
        }

            
                    
        
        
    }
    
}
