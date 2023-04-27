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
public class Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] matriz = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int cont = 0, cont2 = 0;

        //Para i=0 con paso 1 hacer
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[ " + matriz[i][j] + " ]");

            }// Escribir sin saltar
            System.out.println(" ");
        }
        System.out.print("++++++++++++");
        System.out.println(" ");

        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {

                matriz2[j][k] = matriz[k][j] * (-1);

                System.out.print("[ " + matriz2[j][k] + " ]");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] + matriz2[j][i] == 0) {
                    cont++;

                } else if (matriz[i][j] + matriz2[i][j] == matriz[i][j] * 2);
                cont2++;
            }
        }
        if (cont == 9) {

            System.out.println(" La matriz es antisimétrica");

        } else if (cont2 == 9) {
            System.out.println(" La matriz es simetrica");
            
        }else System.out.println("la matriz no antisimetrica ni simetrica,");
    }
    
}
