import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         //Se ingresa por teclado un valor entero,
//mostrar una leyenda que indique si el número es positivo,
//negativo o nulo (es decir cero)

        System.out.println("Ingrese un numero ");
        int numero = input.nextInt();
       if (numero == 0) {
        System.out.println("El numero es nulo");
       }
       if (numero > 0) {
        System.out.println("El numero es positivo");
       }
       if (numero < 0) {
        System.out.println("El numero es negativo");
       }
    }
}
