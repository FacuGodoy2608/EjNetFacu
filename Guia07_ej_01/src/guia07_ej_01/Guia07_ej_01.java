/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas,
y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, 
el título, el autor del libro y el número de páginas
*/
package guia07_ej_01;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Guia07_ej_01 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Libro l1 = new Libro();
        
        System.out.println("ingrese el ISBN");
        l1.setISBN(leer.nextInt());
        System.out.println("ingrese el autor");
        l1.setAutor(leer.nextLine());        
        System.out.println("ingrese el titulo");
        l1.setTitulo(leer.nextLine());
        System.out.println("ingrese cantidad de paginas");
        l1.setNumPag(leer.next());
        
        
        
        System.out.println("------------------");
        System.out.println(l1);
        
    }

}
