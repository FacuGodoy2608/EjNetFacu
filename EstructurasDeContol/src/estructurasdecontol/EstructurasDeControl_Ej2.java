/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdecontol;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class EstructurasDeControl_Ej2 {

    public static void main(String[] args) {
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
        sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.*/
        String frase,cadena;
        cadena="eureka";
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresa una frase");
        frase=leer.nextLine();
        if(frase.equals(cadena)){
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
        
        
        
    }

    private static class string {

        public string() {
        }
    }
    
}
