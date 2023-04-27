/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita retirar 
una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción
de retiro.
 */
package guia07_ejp_04;

import Entidad.Cuenta;
import java.util.Scanner;

public class Guia07_ejP_04 {

    public static void main(String[] args) {
        Cuenta t1 = new Cuenta();
        Scanner leer = new Scanner(System.in);
        double cant;
        System.out.println("Ingrese el nombre del titular");
        t1.setTitular(leer.nextLine());
        System.out.println("Ingrese su salario $");
        t1.setSaldo(leer.nextDouble());
        System.out.println("Ingrese la cantidad de dinero que desea retirar");
        cant = leer.nextDouble();
        
        while (t1.retirar_dinero(cant) > 0) {
            System.out.println("Su saldo actual es de: $" + t1.getSaldo());
            System.out.println("Ingrese la cantidad de dinero que desea retirar");
            cant = leer.nextDouble();

        }
        System.out.println("SALDO INSUFICIENTE");

    }

}
