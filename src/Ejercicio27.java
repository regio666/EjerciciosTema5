/*
 * 27. Desarrollar un programa en el que se pida al usuario una matriz de dimensiones N ×M, y compruebe si la matriz es diagonal.
(Todos los elementos que no están en la diagonal principal son nulos).
 */

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=0,m=0,i=0,j=0,z=0,x=0;
		
		int matriz[][];
		
		boolean diagonal=true;
		
		System.out.print("Introduce el número de filas: \n");
		n=sc.nextInt();
		
		System.out.print("Introduce el número de columnas: \n");
		m=sc.nextInt();
		
		matriz=new int[n][m];
		
		for(x=0;x<n;x++) {
			for(z=0;z<m;z++) {
				System.out.print("Introducir éntero: "+"["+x+"]"+"["+z+"]: ");
				matriz[x][z]=sc.nextInt();
			}
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(matriz[i][j]!=0 && i!=j) {
					diagonal=false;
				}
			}
		}
		
				
		System.out.println("La matriz resultante es: ");
		for(x=0;x<matriz.length;x++) {
			for(z=0;z<matriz[x].length;z++) {
				System.out.print(matriz[x][z]+", ");;
			}
			System.out.println("");
		}
		
		if(diagonal==true) {
			System.out.println("Matriz nula, o diagonal.");
		} else {
			System.out.println("Matriz correcta, no diagonal y números >0.");
		}
		
	}
}