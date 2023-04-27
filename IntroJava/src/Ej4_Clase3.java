
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
public class Ej4_Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
      La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
      float grados,conversor;
      Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados centigrados");
        grados=leer.nextFloat();
        System.out.println("Temperatura grados centigrados: "+grados);
        conversor= 32+(9*(grados/5));
        System.out.println("Temperatura grados Fahrenheit: "+conversor);
        

    }
    
}
