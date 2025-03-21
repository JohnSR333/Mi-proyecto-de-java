import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el sueldo de la persona ");
        int sueldo = input.nextInt();
        if (sueldo > 3000) {
            System.out.println("Debe pagar impuestos ");
        } else {
            System.out.println("No debe pagar impuestos " );
        }
    }
}
