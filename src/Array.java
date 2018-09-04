import java.util.Scanner;

public class Array {

	static int filas;
	static int columnas;
	static int n;
	static int matriz[][];
		
	Scanner sc=new Scanner(System.in);
	
	public Array(int row, int col) {
		
		filas=row;
		columnas=col;
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
	
	for(i=0;i<filas;i++) {
		for(y=0;y<columnas;y++) {
			System.out.print(" "+matriz[i][y]);
		}
		System.out.println("");
	}
	System.out.println("");
}

public void SumarDosMatrices (int[][] matriz) {
	
	int i=0,y=0;
	
	for(i=0;i<Array.filas;i++) {
		for(y=0;y<Array.columnas;y++) {
			matriz[i][y]+=Array.matriz[i][y];
			System.out.print(" "+matriz[i][y]);
		}
		System.out.println("");
	}
	System.out.println("");
		
}
	
	
}
