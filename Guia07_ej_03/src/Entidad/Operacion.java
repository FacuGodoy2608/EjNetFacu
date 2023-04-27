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
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Operacion {

    private int n1;
    private int n2;
            
    public static void main(String[] args) {
        
    }

    public Operacion() {
    }

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    public void crearOperacion (int n1,int n2){
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el valor del PRIMER numero:");
        this.n1= leer.nextInt();
        System.out.println("Ingrese el valor del SEGUNDO numero:");
        this.n2= leer.nextInt();
      
    }
    
    public int sumar (int n1, int n2){
        int op;
        op=n1+n2;
        return op;
    }
    public int restar (int n1, int n2){
        int op;
        op=n1-n2;
        return op;
    }
    public int multiplicar (int n1, int n2){
        int op;
        if (n1==0 || n2==0){
            System.out.println("La multiplicacion es incorrecta");
            return 0;
        }else{
            op=n1*n2;
        } 
        
        return op;
    }
    public float dividir (int n1, int n2){
        float op;
        float x1,x2;
        x1=n1;
        x2=n2;
        if (n1==0 || n2==0){
            System.out.println("La division es incorrecta");
            return 0;
        }else{
           return op=x1/x2;
            
    }
   
}
}
