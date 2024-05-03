import java.util.Scanner;

public class MainSuma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = input.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = input.nextInt();

        // Crear una instancia de la clase Suma
        Suma suma = new Suma();

        // Establecer los valores de a y b en la instancia de Suma
        suma.setA(a);
        suma.setB(b);

        // Realizar la suma usando el método sumar de la instancia de Suma
        suma.sumar();

        // Obtener el resultado de la instancia de Suma
        int r = suma.getR();

        System.out.println("El resultado es: " + r);

        // Mostrar la representación de la instancia de Suma
        System.out.println(suma.toString());
    }
}