/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Rectangulo {

    private float base;
    private float altura;

    public static void main(String[] args) {

    }

    public Rectangulo() {
    }

    public Rectangulo(int base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base");
        this.base = leer.nextFloat();
        System.out.println("Ingrese el valor de la altura");
        this.altura = leer.nextFloat();

    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void area() {
        float area;
        area = (this.base * this.altura);
        System.out.println("El area del rectangulo es de: " + area);
    }

    public void perim() {
        float perim;
        perim = (this.altura + this.base) * 2;
        System.out.println("El perimetro del rectangulo es de: " + perim);
    }

    /*public void dibujar() {
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j <= base; j++) {

                if (i == 1 || i == altura || j == 1 || j == base) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }*/
    public void dibujar(){
                
        for (int i = 1; i <= altura; i++){
            for (int j = 1; j <= base; j++){
               if (i == 1 || i == altura || j == 1 || j == base){
                   System.out.print(" *");
               }else{
                   System.out.print("  ");
               }
           }
            System.out.println();
        }
    }
}
