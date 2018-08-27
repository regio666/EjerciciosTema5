import java.util.Scanner;

/**
12. Desarrollar un programa en el que se pidan al usuario dos vectores de números enteros
e indique en pantalla el producto escalar de los mismos. Si los vectores proporcionados
no tienen la misma longitud, se ha de escribir en pantalla un mensaje indicativo. 
*/
public class Ejercicio12 {

    public static void main(String[] args) {
        int vectorA[];
        int vectorB[];
        int angulo=0;
        int i=0;
        double moduloA=0,moduloB=0;
        Scanner sc = new Scanner(System.in);

        vectorA=Funciones.pedir_vector_antiguo(0);
        vectorB=Funciones.pedir_vector_antiguo(0);

        System.out.print("Introduce el ángulo que forman: ");
        angulo=sc.nextInt();

        for(i=0;i<vectorA.length;i++){
            moduloA=moduloA+(double)((vectorA[i])^2);
        }
        moduloA=Math.sqrt(moduloA);

        for(i=0;i<vectorB.length;i++){
            moduloB=moduloB+(double)((vectorB[i])^2);
        }
        moduloB=Math.sqrt(moduloB);

        System.out.println("");
        System.out.println("El producto escalar de dichos vectores es: "+(moduloA*moduloB*Math.cos(Math.toRadians(angulo))));
        System.out.println("");
    }
}
