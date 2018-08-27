import java.util.Scanner;

/**
16. Desarrollar un programa en el que se pida al usuario un número natural n, se construya
un vector de tamaño n tal que en la posición i-esima almacene el factorial del número i y,
finalmente, se escriban en pantalla todos los elementos de dicho vector.  
*/
public class Ejercicio16 {

    public static void main(String[] args) {
        int longitud=0;
        double vector[];
        int i=0;
        double factor_acumulado=1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de elementos que quiere: ");
        longitud=sc.nextInt();
        vector=new double[longitud];

        for(i=0;i<longitud;i++){
            if(i==0){
                vector[i]=1;
            }else{
                vector[i]=i*factor_acumulado;
                factor_acumulado=vector[i];
            }
        }

        System.out.print("El vector resultante es: [");
        for(i=0;i<vector.length;i++){
            if(i!=vector.length-1){
                System.out.print(vector[i]+",");
            }else{
                System.out.println(vector[i]+"]");
            }
        }

        System.out.println("");
    }
}
