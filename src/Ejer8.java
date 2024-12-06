import java.util.ArrayList;
import java.util.List;

public class Ejer8 {
    public static void main(String[] args) {

        String nom = "antony|fredy|julian|marcos";
        String[] nombres = nom.split("\\|");
        List<String> listNom = new ArrayList<>();

        for (String nombre: nombres){
            listNom.add(nombre);
        }
        System.out.println(listNom);
    }
}
