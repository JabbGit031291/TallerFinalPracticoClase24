import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el valor total de la compra: ");
        double totalCompra = scanner.nextInt();

        double totalCompaConDes = totalCompra;
        double descuento=0;

        if (totalCompra>=1000){
            descuento = totalCompra*0.12;
        } else if (totalCompra>=500) {
            descuento = totalCompra*0.10;
        }else {
            descuento=0;
        }

        totalCompaConDes = totalCompra-descuento;

        System.out.println("El total de la compra es: " + totalCompra);
        System.out.println("El decuento aplicado es: " + descuento);
        System.out.println("El total de la compra con descuento es: " +totalCompaConDes);
    }
}
