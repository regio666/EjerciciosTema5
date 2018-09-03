import java.util.Scanner;

public class Array {

	static int filas;
	static int columnas;
	static int n;
	static int matriz[][];
		
	Scanner sc=new Scanner(System.in);
	
	public Array(int row, int col) {
		
		Array.filas=row;
		Array.columnas=col;
		matriz=new int[row][col];
		
	}
	
public void IntroduceDatosMatriz () {
		
		int i=0,y=0;
		
		for(i=0;i<filas;i++) {
			for(y=0;y<columnas;y++) {
				System.out.print("Elemeto "+i+","+y+": ");
				matriz[i][y]=sc.nextInt();
			}
			
		}
		System.out.println("");
	}

public void MostrarMatriz () {
	
	int i=0,y=0;
	
	for(i=0;i<matriz.length;i++) {
		for(y=0;y<matriz[i].length;y++) {
			System.out.print(" "+matriz[i][y]);
		}
		System.out.println("");
	}
	System.out.println("");
}

public int SumarDosMatrices (int[][] matriz) {
	
	int z=0,x=0;
	
	int resultado=0;
	
	for(z=0;z<Array.filas;z++) {
		for(x=0;x<Array.columnas;x++) {
			resultado+=matriz[z][x];
			System.out.print(" "+resultado);
		}
		System.out.println("");
	}
	System.out.println("");
	return resultado;
	
}
	
	
}
