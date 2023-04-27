package subprogramas_guia4;

import java.util.Scanner;

public class Subprogramas_Guia4 {

    /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
  La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos 
  en el main */
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n1, n2, op;
        float resultado;
        System.out.println("Ingrese el primer numero");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = leer.nextInt();
        do {
            System.out.println("Ingrese la opcion que desea realziar con los numeros ingresados o presione 0(cero) para salir");
            System.out.println("1- SUMAR");
            System.out.println("2- RESTAR");
            System.out.println("3- MULTIPLICAR");
            System.out.println("4- DIVIDIR");
            System.out.println("O- SALIR");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("La suma de los numeros ingresados es: " + sumar(n1, n2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros ingresados es: " + restar(n1, n2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros ingresados es: " + multi(n1, n2));
                    break;
                case 4:
                    resultado = dividir(n1, n2);
                    System.out.println("La division de los numeros ingresados es: " + resultado);
                    break;
                case 0:

            }
        }while (op != 0);
        }
       
        public static int sumar(int v1, int v2) {
        int res;
        res = v1 + v2;
        return res;
    }
        public static int restar (int v1, int v2) {
        int res;
        res = v1 - v2;
        return res;
    }
         public static int multi(int v1, int v2) {
        int res;
        res = v1 * v2;
        return res;
    }
     public static float dividir(int v1, int v2) {
        int res;
        res = v1 / v2;
        return res;
    }    
    }