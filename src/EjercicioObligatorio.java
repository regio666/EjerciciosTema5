import java.util.Scanner;

public class EjercicioObligatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas=0;
		int columnas=0;
		int matrices=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("N�mero de filas: ");
		filas=sc.nextInt();
		
		System.out.print("N�mero de columnas: ");
		columnas=sc.nextInt();
		
		System.out.print("N�mero de matrices: ");
		matrices=sc.nextInt();
		
		
		matriz mat=new matriz(filas,columnas,matrices);
		
		mat.IntroduceDatosMatriz(filas, columnas, matrices);
		
	}

}
