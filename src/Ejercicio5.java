import java.util.Random;

public class Ejercicio5 {
	
	public static void main(String[]args) {
		
	Random rnd=new Random();
	int mayor=0;
	int menor=10;
		
	int[] aleatorios=new int[11];
	
	for (int i=0;i<aleatorios.length;i++) {
		
		aleatorios[i]=(int)(rnd.nextDouble()*11.0);
	}
	

	System.out.println("los números generados son: ");
	for (int i=0;i<aleatorios.length;i++) {
		
	System.out.print(" , "+aleatorios[i]);
	}
	
	System.out.println("");
	for (int i=0;i<aleatorios.length;i++) {
		
		if (aleatorios[i]>mayor) {
			mayor=aleatorios[i];
		} 
		if (aleatorios[i]<menor) {
			menor=aleatorios[i];
		}
		
	}
	
	System.out.println("El mayor es: " +mayor+" y, el menor: "+menor);
	
}
}