import java.util.Scanner;

public class matriz {
	
	private int row;
	private int col;
	private int mat;
	Scanner sc=new Scanner(System.in);
	
	public matriz(int row, int col, int mat) {
		
		int filas = row;
		int columnas = col;
		int matriz = mat;
		
	}
	
	public void IntroduceDatosMatriz (int row, int col, int mat) {
		
		int i=0,y=0;
		
		int[][]matriz=new int[row][col];
		
		for(i=0;i<row;i++) {
			for(y=0;y<col;y++) {
				System.out.print("Elemeto "+i+","+y+": ");
				matriz[i][y]=sc.nextInt();
			}
		}
	}

}
