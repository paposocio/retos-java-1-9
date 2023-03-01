 
import java.util.Scanner; 

public class reto5 { 

    public static void main(String[] args) { 

        Scanner lectura = new Scanner (System.in); 

 
 

        System.out.println("Ingrese su primer nombre"); 

        String name = lectura.nextLine(); 

 
 

        System.out.println("Ingrese su primer apellido"); 

        String lastName = lectura.nextLine(); 

 
 

        System.out.println("La longitud de su primer nombre es de "+name.length()+" caracteres"); 

        System.out.println("La longitud de su primer apellido es de "+lastName.length()+" caracteres"); 

 
 

        System.out.println("Su nombre convertido a mayusculas: "+name.toUpperCase()); 

        System.out.println("Su apellido convertido a minusculas: "+lastName.toLowerCase()); 

 
 

        String completeName = name+lastName; 

 
 

        System.out.println("Su nombre unido es "+completeName); 

 
 

        String sCadena = name; 

        String sSubCadena = sCadena.substring(0,1); 

 
 

        String sCadena2 = lastName; 

        String sSubCadena2 = sCadena2.substring(0,1); 

 
 

        System.out.println("Su nombre generado es: "+sSubCadena+sSubCadena2+lastName); 

 
 

        lectura.close();       

    } 

} 

 
 

 