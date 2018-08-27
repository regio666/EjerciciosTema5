import java.util.Scanner;

public class Ejercicio4 {
	
	static Scanner sc=new Scanner(System.in);
	static int suma=0;
	
	public static void main(String[]args) {
		
	int[] enteros = new int[5];
	
	System.out.print("Introduzca 5 valores: ");
	for (int i=0;i<enteros.length;i++) {
		
		enteros[i]=sc.nextInt();
	}
	
	
	System.out.println("la media es: ");
	for (int i=0;i<enteros.length;i++) {
		
		suma+=enteros[i];
	}
		System.out.print(suma/enteros.length);
		
	}

}
