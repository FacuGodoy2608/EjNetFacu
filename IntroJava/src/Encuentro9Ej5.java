/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Facu
 */
public class Encuentro9Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int matrizA[][] = new int[4][4];
        int matrizB[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                matrizA[i][j] = (int) (Math.random() * 10);
                System.out.print(matrizA[i][j]);
            }

            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                matrizB[i][j] = matrizA[j][i];
                System.out.print(matrizB[i][j]);
            }
            System.out.println("");
        }
    }

}
    
  
