
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Facu
 */
public class Ej5_Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().*/
    int nro;
    float raiz;
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        nro=leer.nextInt();
        System.out.println("El numero es: "+nro+" y su doble es= "+nro*2);
        System.out.println("El numero es: "+nro+" y su triple es= "+nro*3);
        raiz=(float) Math.sqrt(nro);
        System.out.println("El numero es: "+nro+" y su raiz cuadradaes= "+raiz);
        
    
    }
    
    
}
