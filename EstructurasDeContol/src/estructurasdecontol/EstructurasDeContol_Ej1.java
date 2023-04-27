/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdecontol;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class EstructurasDeContol_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        if (num%2==0){
            System.out.println("El numero es PAR!!");
        }else{
            System.out.println("El numero es IMPAR!!");
        }
    }
    
}
    
    

