
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
public class Ej1_clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
      El programa deberá después mostrar el resultado de la suma*/
        int n1,n2,suma;
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
        n1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2=leer.nextInt();
        suma=n1+n2;
        System.out.println("La suma de los 2 valores es igual a: "+suma);
        
    }
    
}
