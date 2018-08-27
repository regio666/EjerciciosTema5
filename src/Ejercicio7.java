import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int dni,posicion;
			
	Scanner sc = new Scanner(System.in);
		
	String[] letra={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E","T"};

	System.out.print("Introduzca número DNI sin letra: ");
	dni=sc.nextInt();
	
	posicion=dni%23;
	
	System.out.print("La letra del DNI es: "+letra[posicion]);
		
	}

}
