
package Entidad;

import java.util.Scanner;


public class Juego {

   
    private int jugador1;
    private int jugador2;
    private int intento;

    public void iniciarJuego() {

        Scanner leer = new Scanner(System.in);
        int numero;
        int numero2;
        this.intento = 1;
        boolean bandera = false;

        System.out.println("Jugador 1 ingrese un numero");
        numero = leer.nextInt();

        System.out.println("Jugador 2 intenta adivinarlo , Recuerda que solo tienes 3 intentos");
        numero2 = leer.nextInt();
        while (bandera == false && this.intento < 3) {
            if (intento==1){
                System.out.println("INTENTO NUMERO= "+this.intento);
                     }
            if (numero == numero2) {
                bandera = true;
                
            } else if (numero > numero2) {

                System.out.println("Jugador 2 -> el valor es mas alto");
                numero2 = leer.nextInt();
                this.intento++;
                System.out.println("INTENTO NUMERO= "+this.intento);

            } else {
                System.out.println("Jugador 2 -> el valor es mas bajo");
                numero2 = leer.nextInt();
                this.intento++;
                System.out.println("INTENTO NUMERO= "+this.intento);

            }
        }
        
        if (bandera== true){
            
            System.out.println("Adivinaste el numero!!! -- El juego finalizo --");
            System.out.println("El ganador es el jugador 2 en el intento= " +(this.intento));
            
        }else{
            
            System.out.println("Gano jugador 1. Se terminaron los intentos= " + (this.intento));
            
        }
                            
    }

}