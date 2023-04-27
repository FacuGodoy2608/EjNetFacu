package estructurasdecontol;

import java.util.Scanner;


public class EstructurasDeContol_Ej3 {

    
    public static void main(String[] args) {
        /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
        Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
        en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/       
        Scanner leer=new Scanner(System.in);
        String frase;
        System.out.println("Ingresa una frase");
        frase=leer.nextLine();
        if (frase.length()== 8){
            
            System.out.println("CORRECTO");
            
            }else System.out.println("INCORRECTO");
        
        
    }
    
}
/*public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una palabra o una frase");
        frase = leer.nextLine();
        if (frase.length() == 8) {
            System.out.println("La palabra ingresada es la correcta");
        } else {
            System.out.println("La palabra ingresada es incorrecta");
        }

    }
}*/