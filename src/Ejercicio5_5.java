import java.util.Scanner;

/*
 * 5. Dise�e un programa que determine el rev�s de un n�mero natural cuya cifra de las unidades es distinto de 0, aumentado en
10. As�, si se ingresa el n�mero 1734, el programa imprimir� 4381 por el rev�s es 4371 mas 10 es 4381.
 */
public class Ejercicio5_5 {

	public static void main(String[]args) {
		
		int numero=0;
		String cadena="";
		String cadenaReves="";
		int numeroReves=0;
		int i=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero: ");
		numero=sc.nextInt();
		
		cadena=String.valueOf(numero);
		
		for (i=cadena.length()-1;i>=0;i--) {
			cadenaReves=cadenaReves+cadena.charAt(i);
		}
		
		numeroReves=Integer.parseInt(cadenaReves);
		
		System.out.print("El n�mero es: "+numeroReves+" + 10 = "+(numeroReves+10));
		
		
	}
	
}
