import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int vectorA[];
	      int vectorB[];
	      
	      int i=0,z=0,y=0,x=0,c=0;
	      
	        
	      Scanner sc = new Scanner(System.in);

	      vectorA=Funciones.pedir_vector_antiguo(0);
	      vectorB=Funciones.pedir_vector_antiguo(0);
		
	      int vectorC[] = new int[vectorA.length+vectorB.length];
	      
	      	      
		for (i=0;i<vectorA.length;i++) {
			
			vectorC[i]=vectorA[i];
		}
		
		for (x=0;x<vectorB.length;x++) {
			
			vectorC[x+vectorA.length]=vectorB[x];
		}
		
		System.out.print("Vector A :");
		for (y=0;y<vectorA.length;y++) {
			
			System.out.print(vectorA[y]);
		}
		
		System.out.println("");
		System.out.print("Vector B :");
		for (z=0;z<vectorB.length;z++) {
	
			System.out.print(vectorB[z]);
		}

		System.out.println("");
		System.out.print("Vector A+B :");
		for (c=0;c<vectorC.length;c++) {
	
			System.out.print(vectorC[c]);
		}

	
		
	}

}
