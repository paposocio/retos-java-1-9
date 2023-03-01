import java.util.Scanner;
public class reto8 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner (System.in);

        System.out.println("Bienvenido"); 

        System.out.println("Ingrese el numero de productos que se van a comprar por referencia:"); 
        int numberOne = lectura.nextInt(); 
        int accumulator=0;

        for (int counter = 1;(int) counter <= numberOne;counter++)
        {
            System.out.println("Ingrese el numero de productos que se van a comprar de la referencia numero "+counter+":"); 
            int product = lectura.nextInt();

            System.out.println(" "); 

            System.out.println("Ingrese el precio individual de este producto:"); 
            int productPrice = lectura.nextInt(); 
           
            System.out.println(" ");

            int subTotal = product*productPrice;
            accumulator = accumulator + subTotal;
        }

        System.out.println("El precio total de la compra es de:"+accumulator);
        
        int number = (int) (Math.random() * 4) + 1;

        if (accumulator>=50001) 

        { 
            switch (number) {
                case 1:
                    System.out.println("Felicidades haz sacado la bola roja"); 

                    System.out.println(" ");

                    double discount=accumulator * 0.1;
                    int total =(int) accumulator - (int) discount;

                    System.out.println("La compra con el descuento tiene un total de: "+total);

                    System.out.println(" ");

                    System.out.println("Ingrese el monto con el que se va a pagar la cuenta:"); 
                    
                    System.out.println(" ");

                    int money = lectura.nextInt();
                    int change = money - accumulator;
                    System.out.println("El cambio es de:" +change); 
                    
                break;

                case 2:
                    System.out.println("Felicidades haz sacado la bola azul"); 

                    System.out.println(" ");

                    double discount1=accumulator * 0.3;
                    double total1 =(int)accumulator-(int)discount1;

                    System.out.println("La compra con el descuento tiene un total de: "+total1); 

                    System.out.println(" ");

                    System.out.println("Ingrese el monto con el que se va a pagar la cuenta:"); 

                    System.out.println(" ");

                    int money1 = lectura.nextInt();
                    int change1 = money1 - accumulator;
                    System.out.println("El cambio es de:" +change1); 
                
                break;

                case 3:
                    System.out.println("Felicidades haz sacado la bola amarilla"); 

                    System.out.println(" ");

                    double discount2=accumulator * 0.5;
                    double total2 =(int)accumulator-(int)discount2;

                    System.out.println("La compra con el descuento tiene un total de: "+total2); 

                    System.out.println(" ");

                    System.out.println("Ingrese el monto con el que se va a pagar la cuenta:"); 

                    System.out.println(" ");

                    int money2 = lectura.nextInt();
                    int change2 = money2 - accumulator;
                    System.out.println("El cambio es de:" +change2); 
                
                break;

                case 4:
                    System.out.println("Felicidades haz sacado la bola blanca ¡lA COMPRA ES TOTALMENTE GRATIS!"); 
                break;
                
            }
        } 

        else 

        { 
            System.out.println("La compra no tiene descuento y tiene un valor de "+accumulator); 

            System.out.println(" ");

            System.out.println("Ingrese el monto con el que se va a pagar la cuenta:"); 

            System.out.println(" ");

            int money = lectura.nextInt();
            int change = money - accumulator;
            System.out.println("El cambio es de:" +change); 

        } 

        lectura.close();
    }
    
}
