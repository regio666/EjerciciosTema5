
/**
 * 
 * @author regio
 *19. Desarrollar un programa en el que se pida al usuario un vector de números enteros v y se construya un nuevo vector u con
los mismos elementos que v pero en el que los números negativos preceden a los positivos. Por ejemplo, si v = [−1, 3,−2, 2,
1,−3] entonces u ha de ser [−1,−2,−3, 3, 2, 1]. El programa ha de escribir en pantalla el nuevo vector.

20. Desarrollar un programa en el que se pida al usuario un vector de números enteros v y se construye un nuevo vector u con
los mismos elementos que v pero ordenados de menor a mayor. El programa ha de escribir en pantalla el nuevo vector.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int vectorV[];
	     
	      
	     
	      int i=0;
	      
	        
	      Scanner sc = new Scanner(System.in);

	      vectorV=Funciones.pedir_vector_antiguo(0);
	    
	      int vectorU[]=Arrays.copyOf(vectorV, vectorV.length);
	      
	      Arrays.sort(vectorU);
	      
	      System.out.print("El vector ordenado es = ");
	      
	      for(i=0;i<vectorU.length;i++) {
	    	  System.out.print(", "+vectorU[i]);
	      }
	    
	      
	      	      
}
}