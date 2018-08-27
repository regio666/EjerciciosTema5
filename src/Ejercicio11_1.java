import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11_1 {

	    public static void main(String[] args) {
	        String cadena_numeros="";
	        int numeros[];
	        int posicion_coma=0;
	        int contador_comas=0;
	        int i=0,j=0;
	        String numero="";
	        int repeticiones=0;
	        int numeroRepetido=0;
	   
	        
	        Scanner sc = new Scanner(System.in);

	        System.out.print
	        ("Introduce un vector de numeros enteros separados por comas (ej:2,3,6,...): ");
	        cadena_numeros=sc.next();
	        //Mientras encuentre comas a partir de una determinada posición...
	        while((posicion_coma=cadena_numeros.indexOf(',', posicion_coma))>-1){ 
	            contador_comas++;//Aumentamos el contador de letras
	            posicion_coma=posicion_coma+1;//Posicionamos la busqueda en el nuevo indice +1
	        }//hemos calculado el numero de lelementos
	        numeros=new int[contador_comas+1];
	        //leemos caracter a caracter y los que no son comas los metemos en el vector
	        for(i=0;i<cadena_numeros.length();i++){
	            if(cadena_numeros.charAt(i)!=','){
	                numero=numero+cadena_numeros.charAt(i);
	            }else{
	                numeros[j]=Integer.parseInt(numero);
	                numero="";
	                j++;
	            }
	        }
	        numeros[j]=Integer.parseInt(numero);//Para guardar el ultimo numero
	        
	        int numerosOrdenados[]=Arrays.copyOf(numeros, numeros.length); //copia del Array
	        
	        Arrays.sort(numerosOrdenados); 
	        
	        for(int y=0;y<(numerosOrdenados.length)-1;y++) { //Comprobar las repeticiones
	        	if(numerosOrdenados[y]==numerosOrdenados[y+1]) {
	        		if(numeros[y]==numerosOrdenados[y]) {
	        			repeticiones++;
	        			numeroRepetido=numerosOrdenados[y];
	        		}
	        	}
	               	
	        }
	        
	        if(repeticiones==0){
	            System.out.println("No hay repeticiones");
	        }else if(repeticiones==1){
	            System.out.println("Hay "+repeticiones+" repetición");
	        }else{
	            System.out.println("Hay "+repeticiones+" repeticiones");
	        }
	        System.out.println("");
}
}
