
import java.util.Scanner;

/**
4. Dise�e un programa que determine la suma de las cifras de un n�mero natural. 
*/
public class Ejercicio5_4 {

    public static void main(String[] args) {
        int numero=0;
        String cadena="";
        int suma=0;
        int i=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un n�mero: ");
        numero= sc.nextInt();

        cadena=String.valueOf(numero);

        for(i=0;i<cadena.length();i++){
            suma=suma+Integer.parseInt(String.valueOf(cadena.charAt(i)));
        }

        System.out.println("La suma de sus d�gitos es: "+suma);
        System.out.println("");
    }
}