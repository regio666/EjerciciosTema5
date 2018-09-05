import java.util.Scanner;

public class Array {

	private int filas;
	private int columnas;
	private int n;
	private int matriz[][];
		
	Scanner sc=new Scanner(System.in);
	
	public Array(int row, int col) {
		
		filas=row;
		columnas=col;
		matriz=new int[row][col];
		
	}
	
public void IntroduceDatosMatriz () {
		
		for(int i=0;i<filas;i++) {
			for(int y=0;y<columnas;y++) {
				System.out.print("Elemeto "+i+","+y+": ");
				matriz[i][y]=sc.nextInt();
			}
			
		}
		System.out.println("");
	}

public void MostrarMatriz () {
	
	for(int i=0;i<filas;i++) {
		for(int y=0;y<columnas;y++) {
			System.out.print(" "+this.matriz[i][y]);
		}
		System.out.println("");
	}
	System.out.println("");
}

public int[][] SumarDosMatrices (int[][] matriz) {
	
	for(int i=0;i<this.filas;i++) {
		for(int y=0;y<this.columnas;y++) {
			matriz[i][y]+=this.matriz[i][y];
		}
				
	}
	return matriz;
}
	
	
}
