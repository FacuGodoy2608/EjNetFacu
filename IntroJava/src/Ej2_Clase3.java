
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
public class Ej2_Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        
        String name;
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingresa tu nombre");
        name=leer.next();
        System.out.println("Tu nombre es: "+name);
        
        
    }
    
}
