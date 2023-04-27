/*
 Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.

 */
package guia07_ejp_06;

import Entidad.Rectangulo;
import java.util.Scanner;

public class Guia07_ejP_06 {

    
    public static void main(String[] args) {
        Rectangulo F1=new Rectangulo();
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese el valor del LADO 1");
        F1.setLado1(leer.nextDouble());
        System.out.println("Ingrese el valor del LADO 2");
        F1.setLado2(leer.nextDouble());
        System.out.println("El valor del area es: "+F1.calcular_area());
        
        
    }
    
}
