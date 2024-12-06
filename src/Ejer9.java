import java.util.ArrayList;
import java.util.List;

public class Ejer9 {
    public static void main(String[] args) {
        Object[] datos = {"antony", 32, "fredy", 45, "maria", 23};

        List<String> nombres = new ArrayList<>();
        List<String> edad = new ArrayList<>();

        for (int i=0;i<datos.length;i++){
            if (i ==0){
                nombres.add((String) datos[i]);
                System.out.println("Los nombres son: " + nombres);
            }else {
                edad.add((String.valueOf(datos[i])));
                System.out.println("Las edades son: " + edad);
            }
        }
            }


        }


