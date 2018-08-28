import java.util.Scanner;

public class EjercicioObligatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas=0;
		int columnas=0;
		int matrices=0;
		int i=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Número de filas: ");
		filas=sc.nextInt();
		
		System.out.print("Número de columnas: ");
		columnas=sc.nextInt();
		
		System.out.print("Número de matrices: ");
		matrices=sc.nextInt();
		
		
//		matriz mat=new matriz(filas,columnas,matrices);
		
		matriz[] mat=new matriz[matrices];
		for (i=0;i<matrices;i++) {
			mat[i]=new matriz(filas,columnas,matrices);
		}
		
		for (i=0;i<mat.length;i++) {
			mat[i].IntroduceDatosMatriz(filas, columnas, matrices);
		}
		
		
	}
}
