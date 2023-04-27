/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá definir además dos constructores:
uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción. 
Se deberán además definir los métodos getters y setters correspondientes.

 */
package Entidad;

/**
 *
 * @author Facu
 */
public class Cancion {

   private String titulo;
   private String autor;
   
    public static void main(String[] args) {
        
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
    }
    public void CreaCancion(String T,String A){
        this.titulo=T;
        this.autor=A;
        System.out.println("Cancion: "+this.titulo+" Autor: "+this.autor);
    }
    
}
