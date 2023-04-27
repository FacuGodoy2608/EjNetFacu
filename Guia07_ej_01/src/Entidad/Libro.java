/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Libro {
           public int ISBN;
    public String titulo;
    public String autor;
    public String numPag;

    public Libro() {
        
    }

    public Libro(int ISBN, String titulo, String autor, int numPag) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el ISBN");
        this.ISBN = leer.nextInt();
        System.out.print("ingrese el titulo");
        this.titulo = leer.next();
        System.out.print("ingrese el autor");
        this.autor = leer.next();
        System.out.println("ingrese el numero de paginas");
        this.numPag = leer.next();
    }
    
    //SETTER
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPag(String numPag) {
        this.numPag = numPag;
    }
    //GETTER

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getNumPag() {
        return numPag;
    }
    

    //METODO PARA MOSTRAR
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
        
    }
    
    
    
}
            
