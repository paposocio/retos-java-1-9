import java.util.Scanner;  
public class reto1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Bienvenid@ al conversor de grados farenheit a centigrados por favor ingrese el valor a convertir ");
        double firstValue=lectura.nextInt();

        double secondValue= (firstValue-32) / 1.8;

        System.out.println("La conversion da como resultado "+secondValue+" grados centigrados");

        lectura.close();
    }
    
}
