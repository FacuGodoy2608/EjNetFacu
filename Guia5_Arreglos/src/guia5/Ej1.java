
package guia5;

/**
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
 */
public class Ej1 {

  
    public static void main(String[] args) {
        int[] arre=new int [100];
        carga(arre);
        mostrar(arre);
        
    }
    
    public static void carga (int []A){
        int aux=1;
        for (int i = 0; i < 100; i++) {
            A[i]=aux;
            aux++;
        }
    }
    
    public static void mostrar (int []A){
    
        for (int i = 99; i >= 0; i--) {
           
            System.out.println("Arre=["+A[i]+"]");
        }
    }
    
}
