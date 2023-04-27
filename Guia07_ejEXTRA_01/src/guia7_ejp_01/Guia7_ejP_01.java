/*
 Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá definir además dos constructores:
uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción. 
Se deberán además definir los métodos getters y setters correspondientes.
 */
package guia7_ejp_01;

import Entidad.Cancion;
import java.util.Scanner;


public class Guia7_ejP_01 {

   
    public static void main(String[] args) {
       Cancion tema=new Cancion();
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el titulo de la cancion");
        tema.setTitulo(leer.nextLine());
        System.out.println("Ingrese el auto de la cancion");
        tema.setAutor(leer.nextLine());
       tema.CreaCancion(tema.getTitulo(), tema.getAutor());
       
    }
    
}
