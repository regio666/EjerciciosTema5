/*24. Desarrollar un programa en el que se pida al usuario una matriz de dimensiones N ×M, y compruebe si la matriz es nula.
(Todos sus elementos iguales a cero)
*/

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=0,m=0,i=0,j=0;
		
		int matriz[][];
		
		boolean nula=true;
		
		System.out.print("Introduce el número de filas: \n");
		n=sc.nextInt();
		
		System.out.print("Introduce el número de columnas: \n");
		m=sc.nextInt();
		
		matriz=new int[n][m];
				
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.print("Introducir éntero: "+"["+i+"]"+"["+j+"]: ");
				matriz[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(matriz[i][j]!=0) {
					nula=false;
				}
			}
		}
		
		
		
		System.out.println("La matriz resultante es: ");
		for(i=0;i<matriz.length;i++) {
			for(j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+", ");;
			}
			System.out.println("");
		}
		
		if(nula==true) {
			System.out.println("Matriz nula.");
		} else {
			System.out.println("Matriz correcta.");
		}
		
				
	}
}
