import java.util.Scanner;

/*
 * 22. Desarrollar un programa en el que se pidan al usuario dos números naturales positivos N y M y se construya una matriz A de
tamaño N×M en la que el elemento A[i, j] sea i+j. Una vez construida la matriz, el programa ha de escribir sus elementos en
pantalla, una fila por línea.
 */

public class Ejercicio22 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=0,m=0,i=0,j=0;
		
		int matriz[][];
		
		System.out.print("Introduce el número de filas: \n");
		n=sc.nextInt();
		
		System.out.print("Introduce el número de columnas: \n");
		m=sc.nextInt();
		
		matriz=new int[n][m];
				
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				matriz[i][j]=i+j;
			}
		}
		
		System.out.println("La matriz resultante es: ");
		for(i=0;i<matriz.length;i++) {
			for(j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+", ");;
			}
			System.out.println("");
		}
		
				
	}
}
