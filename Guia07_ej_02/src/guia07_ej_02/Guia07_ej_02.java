/*
 *Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package guia07_ej_02;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Guia07_ej_02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Circunferencia C1 = new Circunferencia();
        C1.crearCircunferencia(0);
        System.out.println("La circunferencia tiene un radio de: " + C1.getRadio());
        C1.area(C1.getRadio());
        C1.perimetro(C1.getRadio());
    }

}
