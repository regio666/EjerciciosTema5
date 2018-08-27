import java.util.Scanner;

/*
 * 23. Desarrollar un programa en el que se pidan al usuario dos números naturales positivos N y M y construya una matriz de
dimensiones N×M. Los datos de la matriz se pedirán por pantalla. Una vez construida la matriz, el programa ha de escribir
sus elementos en pantalla, una fila por línea.
 */

public class Ejercicio23 {

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
				System.out.print("Introducir éntero: "+"["+i+"]"+"["+j+"]: ");
				matriz[i][j]=sc.nextInt();
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
