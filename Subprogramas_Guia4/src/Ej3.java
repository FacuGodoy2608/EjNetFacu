
import java.util.Scanner;

/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € */
public class Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float euros;
        String moneda;

        System.out.println("Ingrese la cantidad de euros: ");
        euros = leer.nextFloat();
        System.out.println("¿A que tipo de moneda desea convertir?");
        System.out.println("LIBRA - DOLAR - YEN");
        moneda = leer.next();
        
        if (moneda.equals("libra") || moneda.equals("dolar") ||moneda.equals("yen")){
            conversor(euros, moneda);
        }else System.out.println("Nombre de moneda incorrecta");
        

    }

    public static void conversor(float cant, String money) {
        
        switch (money) {
            case "libra":
                    System.out.println(" "+cant+ "€ EUROS son: " +(cant*0.86)+" LIBRAS ");
                    break;
            case "dolar":
                    System.out.println(" "+cant+ "€ EUROS son: " +(cant*1.28611)+"$ DOLARES ");
                    break;
            case "yen":
                    System.out.println(" "+cant+ "€ EUROS son: " +(cant*129.852)+" YENES ");
                    break;        
    } 

}
}
