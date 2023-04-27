/*
  Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0
y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package guia07_ej_03;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Guia07_ej_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int m;
        float d;
        Operacion calculo1 = new Operacion();
        Scanner leer = new Scanner(System.in);

        calculo1.crearOperacion(0, 0);//se crea el objeto calculo1 ("fantasma") con valores asignados por defecto

        System.out.println("La suma de los dos numeros es: " + calculo1.sumar(calculo1.getN1(), calculo1.getN2()));
        System.out.println("La resta de los dos numeros es: " + calculo1.restar(calculo1.getN1(), calculo1.getN2()));
        m = calculo1.multiplicar(calculo1.getN1(), calculo1.getN2());
        if (m != 0) {
            System.out.println("La multiplicacion de los dos numeros es: " + calculo1.multiplicar(calculo1.getN1(), calculo1.getN2()));
        }
        d = calculo1.dividir(calculo1.getN1(), calculo1.getN2());
        if (d != 0) {
            System.out.println("La division de los dos numeros es: " + calculo1.dividir(calculo1.getN1(), calculo1.getN2()));
        }

    }

}
