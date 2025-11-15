package Utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {
     
    
    public static List<Integer> obtenerListaDeNombres() {
        List<Integer> idMarcas = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            idMarcas.add(i);
        }
        return idMarcas;
    }
}
