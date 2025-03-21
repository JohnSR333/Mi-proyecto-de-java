public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        float numero1 = 15;
        float numero2 = 10;
        if (numero1 > numero2) {
            System.out.println("La Suma es: " + (int) (numero1 + numero2));
            System.out.println("La diferencia es: " + (int) (numero1 - numero2));
        } else {
            System.out.println("El producto es: " + (int) (numero1 = numero2));
            System.out.println("La division es: " + (int) (numero1 / numero2));
        }
    }
}
