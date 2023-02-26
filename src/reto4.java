import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);

        System.out.println("Bienvenid@ al juego de piedra papel o tijeras por favor seleccione una opcion (1=PIEDRA/2=PAPEL/3=TIJERAS)");
        int selection =lectura.nextInt();

        System.out.println("*1 , 2 , 3 piedra , papel , o tijeras .....*");
        int result = (int) (Math.random() * (3-1+1) ) + 1;

        if ( selection ==1)
        {
            if(result==3)
            {
                System.out.println("*Maquina ha sacado: tijeras* Haz ganado");
            }
            else if(result==2)
            {
                System.out.println("*Maquina ha sacado: papel* Haz perdido");
            } 
            else 
            {
                System.out.println("Empate , intentalo de nuevo");
            }
            
        }

        else if ( selection ==2)
        {
            if(result==1)
            {
                System.out.println("*Maquina ha sacado: piedra* Haz ganado");
            }
            else if(result==3)
            {
                System.out.println("*Maquina ha sacado: tijeras* Haz perdido");
            } 
            else 
            {
                System.out.println("Empate , intentalo de nuevo");
            }
            
        }

        else if ( selection ==3)
        {
            if(result==2)
            {
                System.out.println("*Maquina ha sacado: papel* Haz ganado");
            }
            else if(result==1)
            {
                System.out.println("*Maquina ha sacado: piedra* Haz perdido");
            } 
            else 
            {
                System.out.println("Empate , intentalo de nuevo");
            }
            
        }

        lectura.close();
    }
    
}

