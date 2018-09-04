import java.util.Scanner;

public class matriz {
	
	private int filas;
	private int columnas;
	private int matriz[][];
	private int SumarDosMatrices;
	
	
	Scanner sc=new Scanner(System.in);
	
	public matriz(int row, int col) {
		
		this.filas=row;
		this.columnas=col;
		matriz=new int[row][col];
		
	}
	
	public void IntroduceDatosMatriz (int row, int col) {
		
		int i=0,y=0;
		
		for(i=0;i<row;i++) {
			for(y=0;y<col;y++) {
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

	
public void SumarDosMatrices (int[][] matriz) {
		
				
		for(int i=0;i<this.filas;i++) {
			for(int y=0;y<this.columnas;y++) {
				matriz[i][y]+=this.matriz[i][y];
			
			}
			
		}
				
		
	}	
	
}
