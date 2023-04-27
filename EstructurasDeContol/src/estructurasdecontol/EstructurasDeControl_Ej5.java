package estructurasdecontol;

import java.util.Scanner;


public class EstructurasDeControl_Ej5 {

    
    public static void main(String[] args) {
 /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario 
   hasta que la suma de los números introducidos supere el límite inicial.*/       
        Scanner leer = new Scanner(System.in);
        int limite, num, suma;
        suma = 0;
        System.out.println("Ingrese el valor limite");
        limite = leer.nextInt();
        while (suma < limite) {
            System.out.println("Ingrese un numero");
            num=leer.nextInt();
            suma=suma+num;
        }
    }
        
    }
    
