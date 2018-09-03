import java.util.*;

public class EjercicioObligatorioMain {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		
		int[][] resultado = new int[Array.filas][Array.columnas];

		System.out.print("Número de filas: ");
		Array.filas=sc.nextInt();
		
		System.out.print("Número de columnas: ");
		Array.columnas=sc.nextInt();
		
		System.out.print("Número de matrices: ");
		Array.n=sc.nextInt();
		
		Array [] vector;
		vector= new Array[Array.n];
		
		for(int i=0;i<Array.n;i++) {
			
			vector[i]=new Array(Array.filas,Array.columnas);
			System.out.println("Matriz "+ (i+1)+"\n");
			vector[i].IntroduceDatosMatriz();
			System.out.println("");
			}
		
		
	System.out.println("Mostrar todas las matrices introducidas: ");
	
		for (int i=0;i<Array.n;i++) {
			vector[i].MostrarMatriz();
		
		}
		
		for (int i=0;i<Array.n;i++) {
			
			vector[i].SumarDosMatrices(resultado);
		
		}
		
	
	}
}


