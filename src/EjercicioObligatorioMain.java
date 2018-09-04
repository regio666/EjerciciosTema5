import java.util.*;

public class EjercicioObligatorioMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
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
		
		int[][] resultado = new int[Array.filas][Array.columnas];
		
		for (int i=0;i<Array.n;i++) {
			
			vector[i].SumarDosMatrices(resultado);
		
		}
		
	
	}
}


