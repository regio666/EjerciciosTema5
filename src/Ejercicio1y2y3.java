import java.util.Scanner;

public class Ejercicio1y2y3 {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[]args) {
		
	int[] enteros = new int[5];
	
	System.out.print("Introduzca 5 valores: ");
	for (int i=0;i<enteros.length;i++) {
		
		enteros[i]=sc.nextInt();
	}
	
	
	for (int i=enteros.length-1;i>=0;i--) {
		
		System.out.println(enteros[i]);
	}
		
	}

}
