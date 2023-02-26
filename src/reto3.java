import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);

        System.out.println("Bienvenid@ al juego del cara y sello por favor seleccione una opcion (1=cara/2=sello)");
        int coin =lectura.nextInt();

        System.out.println("*Girando*");
        int result = (int) (Math.random() * (2-1+1) ) + 1;

        if (result==coin && coin ==1)
        {
            System.out.println("*cara* Haz ganado");
        }
        else if (result==coin && coin ==2)
        {
            System.out.println("*sello* Haz ganado");
        }
        else 
        {
            System.out.println("Perdiste , intentalo de nuevo");
        }
        
        lectura.close();
    }
    
}
