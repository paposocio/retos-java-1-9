import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Bienveni@ a la calculadora para dosis de vacunas en bebés");

        System.out.println("Por favor ingrese el peso del menor");
        double weight=lectura.nextInt();

        System.out.println("Por favor ingrese la edad del menor en meses");
        int age=lectura.nextInt();

        double dose=((weight+10) / (age*10))*8;

        System.out.println("La dosis que se debe aplicar al menor es de "+dose+" ml");

        lectura.close();
    }
    
}
