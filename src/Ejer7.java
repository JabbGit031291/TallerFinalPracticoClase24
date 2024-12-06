import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        double sumaNotas=0;
        double cpntNotas=0;

        do {
            System.out.println("Ingrese la nota : ");
            System.out.println("Para finalizar el calculo ingrese -1");
            System.out.println("ingrese los numero con .");
            nota=sc.nextDouble();
            if (nota !=-1){
                sumaNotas += cpntNotas;
                cpntNotas++;
            }
        }while (nota !=-1);
            if(cpntNotas>0){
            double prom = (double) sumaNotas/cpntNotas;
        System.out.println("El promedio de las notas ingresadas es: " +prom);

        }else {
                System.out.println("Error no se han ingresado numero");
            }
    sc.close();
    }

}
