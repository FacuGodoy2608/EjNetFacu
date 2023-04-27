
import java.util.Scanner;

public class Ej2 {

  
    public static void main(String[] args) {
 /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique 
   si es o no un número primo, debe devolver true si es primo, sino false.Un número primo es aquel que solo puede 
   dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
*/
 Scanner leer=new Scanner(System.in);
 boolean bandera=false;
 int n;
        System.out.println("Ingrese un numero");
        n=leer.nextInt();
        bandera= validacion(n);
        if (bandera==true){
            System.out.println("EL NUMERO ES PRIMO!!!!");
        }else System.out.println("EL NUMERO NO ES PRIMO");
        
    }
    
    public static boolean validacion (int nro){
    
        if (nro<=1){//los numeros menores a 1 no se si son primos
            return false;
         }
        if(nro == 2){//el 2 es numero primo si o si
        return false;
        }
        for (int i = 2; i < nro; i++) {
            if (nro % i == 0)
             return false;
        }
        return true;
    }
}
