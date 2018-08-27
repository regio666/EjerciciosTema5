
import java.util.Scanner;

/**
3. Diseñe un programa que nos permita multiplicar dos matrices de orden 3 
*/
public class Ejercicio5_3 {

    public static void main(String[] args) {
        int matrizA[][]=new int[0][0];
        int matrizB[][]=new int[0][0];
        int matrizC3[][]=new int[0][0];
        String cadena_matrizA="",cadena_matrizB="";
        String cadena_filas[],cadena_columnas[];
        int i3=0,j3=0,k3=0;
        int filas=0,columnas=0;
        int fila=0,columna=0;
        int suma3=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce matriz A (1,2,3,...;1,2,3,...;...): ");
        cadena_matrizA=sc.next();
        System.out.print("Introduce matriz B (1,2,3,...;1,2,3,...;...): ");
        cadena_matrizB=sc.next();

        cadena_filas=cadena_matrizA.split(";");
        cadena_columnas=cadena_filas[0].split(",");
        matrizA=new int[cadena_filas.length][cadena_columnas.length];
        for(i3=0;i3<cadena_filas.length;i3++){
            cadena_columnas=cadena_filas[i3].split(",");
            for(j3=0;j3<cadena_columnas.length;j3++){
                matrizA[i3][j3]=Integer.parseInt(cadena_columnas[j3]);
            }
        }

        cadena_filas=cadena_matrizB.split(";");
        cadena_columnas=cadena_filas[0].split(",");
        matrizB=new int[cadena_filas.length][cadena_columnas.length];
        for(i3=0;i3<cadena_filas.length;i3++){
            cadena_columnas=cadena_filas[i3].split(",");
            for(j3=0;j3<cadena_columnas.length;j3++){
                matrizB[i3][j3]=Integer.parseInt(cadena_columnas[j3]);
            }
        }

        columnas=matrizA[0].length;
        filas=matrizB.length;

        fila=matrizA.length;
        columna=matrizB[0].length;
        matrizC3=new int[fila][columna];
        if(columnas!=filas){
            System.out.println("Error: El número de columnas de A tiene que ser igual al número de filas de B");
        }else{
            for(i3=0;i3<fila;i3++){       //Filas de C
                for(j3=0;j3<columna;j3++){    //Columnas de C
                    suma3=0;
                    for(k3=0;k3<columnas;k3++){
                        suma3=suma3+(matrizA[i3][k3]*matrizB[k3][j3]);
                    }
                    matrizC3[i3][j3]=suma3;
                }
            }
        }

        System.out.println("La matriz resultante es:");
        for(i3=0;i3<fila;i3++){
            for(j3=0;j3<columna;j3++){
                System.out.print(matrizC3[i3][j3]+"    ");
            }
            System.out.println("");
        }

        System.out.println("");
    }
}