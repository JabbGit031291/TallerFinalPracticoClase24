public class Ejer3 {
    public static void main(String[] args) {

        double num1 = 10.2;
        double num2 = 15.5;
        double num3 = 5.5;
        double num0=0;

        try {

            double suma = num1+num2+num3;
            System.out.println("La suma de los valores es " + suma);
            double resta = num1-num2-num3;
            System.out.println("La resta de los valores es " + resta);
            double multipli = num1*num2*num3;
            System.out.println("La multiplicacion de los valores es " + multipli);
            if (num0 != 0){
                System.out.println("no se puede divir por 0");
            }else {

                double divi = (num1*num2)/num3;
                System.out.println("La division de los valores es "+ divi);
            }

        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }

    }
}
