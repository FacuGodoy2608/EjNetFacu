package guia5;

import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido
 *
 */
public class Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, b;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        int arre[] = new int[n];
        carga(arre, n);
        System.out.println("Ingrese el numero que desea buscar en el vector, debe ser entre 0-20");
        b = leer.nextInt();
        mostrar(arre, n);
        buscar(arre, b, n);

    }

    public static void carga(int []xa, int n) {
        for (int i = 0; i < n; i++) {
            xa[i] = (int) (Math.random() * 20);//cargo el vector con numeros aleatorios y lo multiplico * 20 para que me de numeros
            //enteros entre 0 y 20 , ya que la funcion Math.random arroja valores entre 0.0 y 1.0 
        }
    }

    public static void mostrar(int[] xa, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("[" + xa[i] + "]");
        }
    }

    public static void buscar(int[] xa, int b, int n) {
        int pos, cont;
        cont = 0;
        for (int i = 0; i < 10; i++) {
            if (xa[i] == b) {
                pos = i;
                cont++;
                System.out.println("");
                System.out.println("El numero " + b + " se encuentra en la posicion: " + (pos+1) + " y se encuentra repetido: " + cont + " vez/ces");
            }
        }
        if (cont==0){
                System.out.println("");
                System.out.println("NO SE ENCONTRO EL NUMERO EN EL VECTOR");
            }

    }

}
