package examen2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JaviA
 */
public class RegistrosToAlumnado {
    
    public static ArrayList<Alumnado> regToAlum(ArrayList<RegistroJSON> lista){
        
        ArrayList<Alumnado> alumnos = new ArrayList<>();
        
        for (RegistroJSON r : lista) {
            
            Alumnado a = new Alumnado();
            
            a.setNombre(r.getAlumnoA());
            
            Map<String, String> map = new HashMap<>();
            
            map.put("OACV", r.getoACV());
            map.put("EA", r.getoACV());
            map.put("TII", r.getoACV());
            map.put("TC", r.getoACV());
            map.put("ING", r.getoACV());
            map.put("FOL", r.getoACV());
            map.put("CEAC", r.getoACV());
            
            a.setModulos(map);
            alumnos.add(a);
            
        }
        
        return alumnos;
    }
            
    
}
