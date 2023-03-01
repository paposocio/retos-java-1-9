import java.util.Scanner;
public class reto9 {
    public static void main(String[] args) {
        Scanner lectura =new Scanner (System.in);

        int bet = 0;
        int attempts = 1;

            for ( int counter=0;counter <= 2; counter++)
            {
                System.out.println("Bienvenid@ al juego del cara y sello por favor ingrese un monto para apostar");
                int userBet =lectura.nextInt();
                
                System.out.println("Seleccione una opcion (1=cara/2=sello)");
                int coin =lectura.nextInt();

                System.out.println("*Girando*");
                int result = (int) (Math.random() * (2-1+1) ) + 1;
        
                    if (result==coin && coin ==1)
                    {
                        System.out.println("*cara* Haz ganado");
                        int money=userBet*2;
                        bet += money;
                    }
                    else if (result==coin && coin ==2)
                    {
                        System.out.println("*sello* Haz ganado");
                        int money=userBet*2;
                        bet += money;
                    }
                    else 
                    {
                        System.out.println("Perdiste , intentalo de nuevo");
                        bet -= userBet;
                    }

                System.out.println("Desea realizar otro intento?? (1=si/2=no)");
                int option =lectura.nextInt();

                    if (option == 2)
                    {
                        counter = 2;
                        System.out.println("Usted jugo un total de: "+attempts+" intentos y acumulo un total de "+bet);
                    }
                    else if (option== 1)
                    {
                        counter = 1;
                        attempts ++;
                    }
            }

        lectura.close();
    }
    
}

    
