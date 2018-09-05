import java.util.*;

public class EjercicioObligatorioMain {

	
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int filas=0;
		int columnas=0;
		int n=0;
		
		sc = new Scanner(System.in);
		
		System.out.print("Número de filas: ");
		filas=sc.nextInt();
		
		System.out.print("Número de columnas: ");
		columnas=sc.nextInt();
		
		System.out.print("Número de matrices: ");
		n=sc.nextInt();
		
		Array [] vector;
		vector= new Array[n];
		
		for(int i=0;i<n;i++) {
			
			vector[i]=new Array(filas,columnas);
			}
			
		for(int i=0;i<n;i++) {
			
			System.out.println("Matriz "+ (i+1)+"\n");
			vector[i].IntroduceDatosMatriz();
			System.out.println("");
			}
		
		
	System.out.println("Mostramos todas las matrices introducidas: ");
	
		for (int i=0;i<n;i++) {
			
			vector[i].MostrarMatriz();
		
		}
		
		int[][] resultado = new int[filas][columnas];
		
		for (int i=0;i<n;i++) {
			vector[i].SumarDosMatrices(resultado);
		}
		
		System.out.println("Suma de todas las matrices introducidas: ");	
		for(int i=0;i<resultado.length;i++) {
			for(int y=0;y<resultado[i].length;y++) {
				System.out.print(" "+resultado[i][y]);
				
			}
			System.out.println("");
		}
	
	}
}


