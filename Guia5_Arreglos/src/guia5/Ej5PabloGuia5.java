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
public class Ej5PabloGuia5 {

    /**
     * @param args the command line arguments
     */
      

    public static void main(String[] args) {

        //CREAMOS LAS MATRICES
        int[][] matriz = new int[3][3];
        int[][] transpuesta = new int[3][3];
        int cont = 0, cont2 = 0;

        //LLENAMOS LA MATRIZ
        matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = -2;
        matriz[2][0] = -4;
        matriz[2][1] = 2;
        matriz[2][2] = 8;

        //LLENAMOS MATRIZ TRANSPUESTA
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[i][j] = matriz[j][i];

            }

        }
        //MOSTRAMOS LA MATRIZ
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("");

        //MATRIZ TRASPUESTA
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print("[" + matriz[k][j] + "]");
            }
            System.out.println(" ");
        }

        //COMPARAMOS
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if (matriz[j][k] + transpuesta[j][k] == 0) {
                    
                    cont++;
                    

                } if (matriz[j][k] + transpuesta[j][k] == matriz[j][k] * 2){
                    cont2++;
                }
            }

        }
        
        if (cont == 9) {
            System.out.println("La matriz es antisimetrica");
        } else if (cont2 == 9) {
            System.out.println("La matriz es simetrica ");
        } else {
            System.out.println("La matriz no es simetrica, ni antisimetrica");
        }
    }

}
    //public static void main(String[] args) {

        //CREAMOS LAS MATRICES
        int[][] matriz = new int[3][3];
        int[][] transpuesta = new int[3][3];
        int cont = 0, cont2 = 0;

        //LLENAMOS LA MATRIZ
        matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = -2;
        matriz[2][0] = -4;
        matriz[2][1] = 2;
        matriz[2][2] = 0;

        //LLENAMOS MATRIZ TRANSPUESTA
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[i][j] = matriz[j][i];

            }

        }
        //MOSTRAMOS LA MATRIZ
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("");

        //MATRIZ TRASPUESTA
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print("[" + matriz[k][j] + "]");
            }
            System.out.println(" ");
        }

        //COMPARAMOS
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if (matriz[j][k] + transpuesta[j][k] == 0) {
                    
                    cont++;
                    

                } if (matriz[j][k] + transpuesta[j][k] == matriz[j][k] * 2){
                    cont2++;
                }
            }

        }
        
        if (cont == 9) {
            System.out.println("La matriz es antisimetrica");
        } else if (cont2 == 9) {
            System.out.println("La matriz es simetrica ");
        } else {
            System.out.println("La matriz no es simetrica, ni antisimetrica");
        }
    }

}//
    
  
