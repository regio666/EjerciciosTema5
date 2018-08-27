
/**
1. Diseñe un programa que muestre por pantalla todos los números de 4 cifras que cumplen
con la condición de que la suma de las cifras pares es igual a la suma de las cifras 
impares. Muestre también la cantidad de números encontrados.  
*/
public class Ejercicio5_2 {

    public static void main(String[] args) {
        int i=0;
        String numero="";
        int contador=0;
        int suma_pares=0,suma_impares=0;

        System.out.println("Los números son: ");
        for(i=1000;i<10000;i++){
            if(i==2000 || i==3000 || i==4000 || i==5000 || i==6000 || i==7000 || i==8000 || i==9000){
                System.out.println("");
            }
            suma_pares=0;
            suma_impares=0;
            numero=String.valueOf(i);
            suma_pares=Integer.parseInt(""+numero.charAt(1))+Integer.parseInt(""+numero.charAt(3));
            suma_impares=Integer.parseInt(""+numero.charAt(0))+Integer.parseInt(""+numero.charAt(2));
            if(suma_pares==suma_impares){
                System.out.print(i+" - ");
                contador++;
            }
        }
        System.out.println("");
        System.out.println("Cantidad de números encontrados es: "+contador);
        System.out.println("");
    }
}