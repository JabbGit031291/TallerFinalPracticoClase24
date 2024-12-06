import java.util.Scanner;

public class Ejer2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese el numero para seleccionar la cuenta que desea conocer: ");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("Ingrese el numero de la opción");
            int opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El tipo es de cuenta de ahorros");
                    break;
                case 2:
                    System.out.println("El tipo es de cuenta corriente");
                case 3:
                    System.out.println("El tipo es de cuenta Nomina");
                    break;
            }
        }catch (Exception e){
            System.out.println("Error al ingresar un numero" + e.getMessage());
        }

    }
}
