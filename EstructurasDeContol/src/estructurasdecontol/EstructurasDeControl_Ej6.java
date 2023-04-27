package estructurasdecontol;

import java.util.Scanner;


public class EstructurasDeControl_Ej6 {

    
    public static void main(String[] args) {
  /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
   El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
   El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
   en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
   ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
   caso contrario se vuelve a mostrar el menú*/ 
  
          Scanner leer = new Scanner(System.in);
        int valor1, valor2, num;
        double division;
        String letra = ("N");
        System.out.println("Ingrese dos numeros enteros positivos");
        valor1 = leer.nextInt();
        valor2 = leer.nextInt();
        do {
            System.out.println("Menu");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.print("Ingrese una Opcion ");
            num = leer.nextInt();
            switch (num) {
                case 1:
                    System.out.println("La suma de los numeros ingresados es: " + (valor1 + valor2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros ingresados es: " + (valor1 - valor2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros ingresados es: " + (valor1 * valor2));
                    break;
                case 4:
                    division = (double) valor1 / valor2;
                    System.out.println("La division de los numeros ingresados es: " + (division));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    letra = leer.next();
                    if (letra.equalsIgnoreCase("S")) {
                        break;
                    }
                    break;
            }
        } while (!letra.equalsIgnoreCase("S"));
    }
    }
    

