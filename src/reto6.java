public class reto6 { 

    public static void main(String[] args) { 

        System.out.println("Bienvenido al simulador de craps"); 

        System.out.println("Iniciando ...."); 

        System.out.println("Lanzando dados"); 

 
 

        int number = (int) (Math.random() * 6) + 1; 

        int numberTwo = (int) (Math.random() * 6) + 1; 

 
 

        System.out.println("El primer resultado es: "+number); 

        System.out.println("El segundo resultado es: "+numberTwo); 

 
 

        if (number+numberTwo==2) 

        { 

            System.out.println("Felicidades haz ganado"); 

        } 

        else if (number+numberTwo==3) 

        { 

            System.out.println("Felicidades haz ganado"); 

        } 

        else if (number+numberTwo==11) 

        { 

            System.out.println("Felicidades haz ganado"); 

        } 

        else if (number==2 || number==12 ) 

        { 

            System.out.println("Felicidades haz ganado"); 

        } 

        else if (numberTwo==2 || numberTwo==12 ) 

        { 

            System.out.println("Felicidades haz ganado"); 

        } 

        else if (number+numberTwo==7) 

        { 

            System.out.println("Felicidades haz ganado"); 

        } 

        else 

        { 

            System.out.println("Intenta de nuevo :'( "); 

        } 

 
 
 
 

    } 

     

} 

 
 

 