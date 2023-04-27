/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea un método "calcular_aumento" que calcule 
el aumento salarial de un empleado en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado 
tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package guia07_ejp_05;

import Entidad.Empleado;
import java.util.Scanner;


public class Guia07_ejP_05 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Empleado E1= new Empleado ();
        System.out.println("Ingrese su nombre");
        E1.setNombre(leer.next());
        System.out.println("Ingrese su salario");
        E1.setSalario(leer.nextDouble());
        System.out.println("Ingrese su edad");
        E1.setEdad(leer.nextInt());
        E1.calcular_aumento();
        
    }
    
}
