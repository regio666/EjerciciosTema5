
/*
 * Desarrollar un programa en el que se construya una matriz de tamaño 3 × 3 de números enteros a partir de los datos
proporcionados por el usuario. Los datos de la matriz se por filas, desechando los elementos que se escriban de más y
rellenando con ceros los que se escriban de menos. Una vez construida la matriz, el programa ha de escribir sus elementos
en pantalla, una fila por línea.
 */

import java.util.*;

public class Ejercicio21 {
	
	public static void main(String[]args) {
		
		int matriz[][]=new int[3][3];
		
		int i=0,z=0,y=0,x=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los datos en la matriz de 3x3: ");
		for(i=0;i<matriz.length;i++) {
			for(z=0;z<matriz.length;z++) {
				matriz[i][z]=sc.nextInt();
			}
		}
		
		System.out.println("La matriz es = ");
		for(y=0;y<matriz.length;y++) {
			System.out.println("");
			for(x=0;x<matriz.length;x++) {
				System.out.print(matriz[y][x]);
			}
		}
		
		
	}

}
