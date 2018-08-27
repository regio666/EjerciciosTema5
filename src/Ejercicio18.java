
/**
 * 
 * @author regio
 *18. Desarrollar un programa en el que se pida al usuario dos vectores de números enteros, se construya un nuevo vector v que
almacene la suma de ambos vectores y, finalmente, se escriban en pantalla todos los elementos de v. El vector suma se ha
de ajustar al vector más largo proporcionado por el usuario, completando el más corto con ceros. Por ejemplo, la suma de
los vectores [1, 2, 3] y [1, 2, 3, 4, 5] es [2, 4, 6, 4, 5].
 */
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int vectorA[];
	      int vectorB[];
	      int vectorV[];
	      
	      boolean mayorA=true;
	      
	      int i=0,z=0,y=0,x=0,c=0;
	      
	        
	      Scanner sc = new Scanner(System.in);

	      vectorA=Funciones.pedir_vector_antiguo(0);
	      vectorB=Funciones.pedir_vector_antiguo(0);
		
	     
	      
	      if(vectorA.length>=vectorB.length){
	            vectorV=new int[vectorA.length];
	        }else{
	            vectorV=new int[vectorB.length];
	            mayorA=false;
	        }

	        if(mayorA){
	            vectorB=Arrays.copyOf(vectorB, vectorA.length);
	        }else{
	            vectorA=Arrays.copyOf(vectorA, vectorB.length);
	        }
	      
	      for(i=0;i<vectorV.length;i++) {
	    	  vectorV[i]=vectorA[i]+vectorB[i];
	      }
	      
	      System.out.print("La suma de los vectores es: ");
	      for(z=0;z<vectorV.length;z++) {
	    	  System.out.print(vectorV[z]);
	      }
	      
	      	      
}
}