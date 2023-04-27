/*
 *Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=π*(radio^2)).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Entidad;

import java.util.Scanner;

public class Circunferencia {

    private float radio;

    public Circunferencia() {
    }

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(float radio) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        this.radio = leer.nextFloat();
    }

    public void area(float radio) {
        float sup;
        sup = (float) (Math.PI * Math.pow(radio, 2));
        System.out.println("El area es: " + sup);
    }

    public void perimetro(float radio) {
        float perim;
        perim = (float) (2 * Math.PI * radio);
        System.out.println("El perimetro es: " + perim);
    }

}
