package estructurasdecontol;

import java.util.Scanner;

public class EstructurasDeControl_Ej4 {

    
    public static void main(String[] args) {
   /*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
     Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
     en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.*/
        
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase o palabra");
        frase = leer.nextLine(); 
        if (frase.substring(0,1).toUpperCase().equals("A") ) {
            System.out.println(" la palabra es CORRECTA");
        } else {
            System.out.println("La palabra es INCORRECTA");
        }

    }
        
    }
    
