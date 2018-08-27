import java.util.Scanner;

public class Funciones {
    public static int[] pedir_vector_antiguo(int longitud){
        String cadena_numeros="";
        int vector[];
        int posicion_coma=0;
        int contador_comas=0;
        int i=0,j=0;
        String numero="";
        Scanner sc = new Scanner(System.in);

        if(longitud==0){
            System.out.print("Introduce un vector de numeros enteros separados por comas (ej:2,3,6,...): ");
            cadena_numeros=sc.next();
            while((posicion_coma=cadena_numeros.indexOf(',', posicion_coma))>-1){//Mientras encuentre comas...
                contador_comas++;//Aumentamos el contador de letras
                posicion_coma=posicion_coma+1;//Posicionamos la busqueda en el nuevo indice +1
            }
            vector=new int[contador_comas+1];

            for(i=0;i<cadena_numeros.length();i++){
                if(cadena_numeros.charAt(i)!=','){
                    numero=numero+cadena_numeros.charAt(i);
                }else{
                    vector[j]=Integer.parseInt(numero);
                    numero="";
                    j++;
                }
            }
            vector[j]=Integer.parseInt(numero);     //Para guardar el ultimo numero
        }else{
            System.out.print("Introduce un vector de "+longitud+" numeros enteros separados por comas (ej:2,3,6,...): ");
            cadena_numeros=sc.next();
            while((posicion_coma=cadena_numeros.indexOf(',', posicion_coma))>-1){     //Mientras encuentre comas...
                contador_comas++;     //Aumentamos el contador de comas
                posicion_coma=posicion_coma+1;   //Posicionamos la busqueda en el nuevo indice +1
            }
            if(longitud==contador_comas+1){
                vector=new int[contador_comas+1];
                for(i=0;i<cadena_numeros.length();i++){
                   if(cadena_numeros.charAt(i)!=','){
                       numero=numero+cadena_numeros.charAt(i);
                   }else{
                       vector[j]=Integer.parseInt(numero);
                       numero="";
                       j++;
                   }
                }
                vector[j]=Integer.parseInt(numero);     //Para guardar el ultimo numero
            }else{
                System.out.println("Error en el numero de elementos");
                vector=new int[0];
            }
        }
        return vector;
    }    
}
