import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main(String[]args) {

	  int vectorA[];
      int vectorB[];
      
      int i=0,z=0,y=0;
      
      final int factor=2;
      
      
      Scanner sc = new Scanner(System.in);

      vectorA=Funciones.pedir_vector_antiguo(0);
      vectorB=Funciones.pedir_vector_antiguo(0);
	
      int FactorVectorA[] = new int[vectorA.length];
      int FactorVectorB[] = new int[vectorB.length];
      boolean proporcional[]=new boolean[vectorA.length];
      
	if(vectorA.length!=vectorB.length) {
			System.out.println("Los vectores no son del mismo tamaño.");
	} else {
		for(i=0;i<vectorA.length;i++) {
			FactorVectorA[i]=vectorA[i];
		}
	}
	
	for(z=0;z<vectorB.length;z++) {
			FactorVectorB[z]=vectorB[z]/factor;
		
		if (FactorVectorB[z]==FactorVectorA[z]) {
			proporcional[z]=true;
		}
		
	}
	
	
	for(y=0;y<proporcional.length;y++) {
		
		if (proporcional[y]==true) {
		System.out.println("El vector es proporcional.");
	} else {
		System.out.println("El vector no es proporcional.");
	}
	}
	
}
}