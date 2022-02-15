package ejercicio6;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public abstract class inputNumbers {

    static Vector<Integer> vector = new Vector<>();
    private static int auxiliar;

    public static void agregarNumeros(){

        try {
            do {
                Scanner response = new Scanner(System.in);
                System.out.println("Introduce un dígito: ");
                auxiliar = response.nextInt();
                if (!vector.contains(auxiliar)) {
                    System.out.println("No lo contiene");
                    vector.add(auxiliar);
                } else {
                    System.out.println("Ya lo contiene");
                    System.out.println(vector);
                    break;
                }
            } while (auxiliar != 0);
        } catch (InputMismatchException e) {
            System.out.println("Ups, ingresaste un número y/o, letra inválida, ¡por favor verifícala!");
        }
    }
}


