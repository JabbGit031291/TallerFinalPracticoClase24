public class Ejer4 {

    public static int numPares(){
        int sum = 0;
        for (int num=2;num<=100;num+=2){
            sum +=num;
        }
        return sum;
    }
    public static void main(String[] args) {

        int result = numPares();
        System.out.println("El resultado de la suma es: " +result);

    }
}
