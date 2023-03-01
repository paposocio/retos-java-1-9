import java.util.Scanner; 

public class reto7 { 

        public static void main(String[] args) { 

            Scanner lectura = new Scanner (System.in);   
            System.out.println("Bienvenido"); 

            System.out.println("Ingrese el valor de la compra"); 
            int money = lectura.nextInt(); 

            int number = (int) (Math.random() * 4) + 1; 

            if (money>=50001) 

            { 
                switch (number) {
                    case 1:
                        System.out.println("Felicidades haz sacado la bola roja"); 

                        double discount=money * 0.1;
                        double total =money-discount;

                        System.out.println("La compra con el descuento tiene un total de: "+total); 
                        
                    break;
    
                    case 2:
                        System.out.println("Felicidades haz sacado la bola azul"); 

                        double discount1=money * 0.3;
                        double total1 =money-discount1;

                        System.out.println("La compra con el descuento tiene un total de: "+total1); 
                    
                    break;
    
                    case 3:
                        System.out.println("Felicidades haz sacado la bola amarilla"); 

                        double discount2=money * 0.5;
                        double total2 =money-discount2;

                        System.out.println("La compra con el descuento tiene un total de: "+total2); 
                    
                    break;
    
                    case 4:
                        System.out.println("Felicidades haz sacado la bola blanca ¡lA COMPRA ES TOTALMENTE GRATIS!"); 
                    break;
                    
                }
            } 

            else 

            { 

                System.out.println("La compra no tiene descuento y tiene un valor de "+money); 

            } 

            lectura.close();

 
 

        } 

} 

 
 

 