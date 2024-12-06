public class Ejer10 {

    private String nombre;
    private int edad;
    private int altura;

    public Ejer10(String nombre,int edad, int altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura= altura;
    }

    public void datos(){
        System.out.println("Nombe: " + nombre);
        System.out.println("Edad : " + edad );
        System.out.println("Alutura : " + altura);
    }

    public static void main(String[] args) {
        Ejer10 datosPersona = new Ejer10("Jhon",22,180);

        datosPersona.datos();
    }
}
