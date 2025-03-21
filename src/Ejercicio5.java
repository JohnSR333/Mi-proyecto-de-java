import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Realizar un programa que solicite ingresar
//dos números distintos y muestre por pantalla el mayor de ellos.
        System.out.println("Ingrese numero 1");
        int numero1 = input.nextInt();
        System.out.println("Ingrese numero 2");
        int numero2 = input.nextInt();
        if (numero1 > numero2) {
            System.out.println("El numero mayor es: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El numero mayor es: " + numero2);
        }
    }
}
