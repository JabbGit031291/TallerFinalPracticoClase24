import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de la tabla a multiplicar: ");
        int num = sc.nextInt();
        int cont = 1;
        while (cont<=20){
            int result = num*cont;
            System.out.println(num + " X " + cont + " = "+result);
            cont=cont+1;
        }
    }
}
