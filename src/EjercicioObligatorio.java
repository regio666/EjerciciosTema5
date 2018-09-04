import java.util.Scanner;

public class EjercicioObligatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int filas=0;
		int columnas=0;
		int matrices=0;
		int i=0,y=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Número de filas: ");
		filas=sc.nextInt();
		
		System.out.print("Número de columnas: ");
		columnas=sc.nextInt();
		
		System.out.print("Número de matrices: ");
		matrices=sc.nextInt();
		
		System.out.println("");
		
		matriz[] mat;
		mat=new matriz[matrices];
		
		for (i=0;i<matrices;i++) {
			mat[i]=new matriz(filas,columnas);
		}
		
		for (i=0;i<mat.length;i++) {
			System.out.println("Matriz "+(i+1)+"\n");
			mat[i].IntroduceDatosMatriz(filas, columnas);
			
			
		}
		
		System.out.println("Mostrar todas las matrices introducidas: ");
		
		for (i=0;i<mat.length;i++) {
			mat[i].MostrarMatriz();
			
		}
		
		int[][] resultado = new int[filas][columnas];
		
		
		
		for (i=0;i<mat.length;i++) {
			mat[i].SumarDosMatrices(resultado);
		}
		
		System.out.println("Suma de todas las matrices introducidas: ");	
		for(i=0;i<resultado.length;i++) {
			for(y=0;y<resultado[i].length;y++) {
				System.out.print(" "+resultado[i][y]);
				
			}
			System.out.println("");
		}
		
		
	}
}
