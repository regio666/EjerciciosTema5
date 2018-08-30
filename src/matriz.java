import java.util.Scanner;

public class matriz {
	
	private int filas;
	private int columnas;
	private int matrices;
	private int matriz[][];
	Scanner sc=new Scanner(System.in);
	
	public matriz(int row, int col, int mat) {
		
		this.filas=row;
		this.columnas=col;
		this.matrices=mat;
		matriz=new int[row][col];
	}
	
	public void IntroduceDatosMatriz (int row, int col, int mat) {
		
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
	
	public void SumarMatriz () {
			
			int i=0,y=0;
			int[][] matrizResultado=new int[filas][columnas]; 
			
			for(i=0;i<matriz.length;i++) {
				for(y=0;y<matriz[i].length;y++) {
					matrizResultado[i][y]=matriz[i][y]+matriz[i][y];
					System.out.print(matrizResultado);
				}
				System.out.println("");
			}
			System.out.println("");
		}
	
	
}
