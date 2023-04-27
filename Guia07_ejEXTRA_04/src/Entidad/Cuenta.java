/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita retirar 
una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción
de retiro.

 */
package Entidad;


public class Cuenta {
    
    public String titular;
    public double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public double retirar_dinero (double cant){
        
        saldo= saldo-cant;
        if (saldo<0){
            
            System.out.println("TU SALDO ES NEGATIVO: $"+saldo);
            
            }
        return saldo;
                
    }
    
}
