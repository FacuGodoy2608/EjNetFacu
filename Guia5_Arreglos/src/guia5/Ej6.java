/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author Facu
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        int suma1 = 0;
        int suma2 = 0;
        int[][] matriz = new int[3][3];
        {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz[i][j] = (int) (Math.random() * 10);
                    System.out.print("[ " + matriz[i][j] + " ]");

                }
                System.out.println(" ");
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    suma = matriz[0][j] + suma;
                    suma1 = matriz[i][0] + suma1;
                    suma2 = matriz[i][i] + suma2;

                }

            }
        }
        if (suma == suma1 && suma1 == suma2) {
            System.out.print("El cuadrado es magico");

        } else {
            System.out.print("El cuadrado no es magico");
        }

    }
}

