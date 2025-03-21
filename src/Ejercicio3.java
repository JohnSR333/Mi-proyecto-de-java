import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = input.nextInt();
        if (numero >= 100 ) {
            System.out.println("Numero no valido");
        } if (numero <= 0) {
            System.out.println("Numero no valido");
        }
        if (numero < 10 && numero > 0 ) {
            System.out.println("Numero de una cifra") ;
        } if (numero < 100 && numero > 9) {
            System.out.println("Numero de dos cifras");
        }
    }
}