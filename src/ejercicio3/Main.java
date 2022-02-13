package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int left = 0;
        int right = 0;

        System.out.println("¡Creación y ordenamiento de números aleatorios! ");
        System.out.println("-------------------------------------------------\n");

        int response = 0;

        do {
            System.out.println("Ingresa por favor un número para crear y organizar los números de la siguiente forma:\n");
            System.out.println("1. Para ordenarlos con el Algoritmo de Burbuja.\n");
            System.out.println("2. Para ordenarlos con el Algoritmo QuickSort.\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el dígito: ");
            response = Integer.valueOf(scanner.nextLine());

            switch (response){
                case 1:
                    System.out.println("Generado con Algoritmo de Burbuja");
                    RamdNumber.sortByBubbleAlgorithm();
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Generado con Algoritmo QuickSort");
                    RamdNumber.sortByQuick(RamdNumber.numberRandom, left, right);
                    System.out.println(" ");
                    break;
            }

        }while (response != 0);

        /*
        ramdNumber.generateRamdomNumer();

        ramdNumber.sortByQuick(ramdNumber.numberRandom, left, right);
         */

    }
}
