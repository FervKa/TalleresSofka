package ejercicio3;

import java.util.Random;

public class RamdNumber  {

    static int numer1 =0;
    static int numer2 =0;
    static int[] numberRandom = new int[10];


    public static void generateRamdomNumer() {
        Random rnd = new Random();
        for (int i = 0; i < numberRandom.length; i++) {
            numberRandom[i] = rnd.nextInt();
            System.out.println("Números Aleatorios: " + numberRandom[i]);
        }
        System.out.println(" ");
    }

    public static void sortByBubbleAlgorithm() {
        System.out.println(" ");
        generateRamdomNumer();
        int assintant = 0;
        int[] sortedArray;

        for (int i = 0; i < numberRandom.length; i++) {
            for (int j = 0; j < numberRandom.length - i; j++) {
                if (numberRandom[j] > numberRandom[i + j]) {
                    assintant = numberRandom[j];
                    numberRandom[j] = numberRandom[j + 1];
                    numberRandom[j + 1] = assintant;
                }
            }
        }
        sortedArray = numberRandom;
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("Array ordenado: " + sortedArray[i]);
        }
        System.out.println(" ");
    }

    public static void sortByQuick(int numberRandom[], int left, int rigth){
        System.out.println(" ");
        generateRamdomNumer();
        int pivot = numberRandom[left];
        int i = left;
        int j = rigth;
        int assintant;

        while (i<j){
            while (numberRandom[i] <= pivot && i < j) i++;
            while (numberRandom[j] > pivot) j--;
            if(i<j){
                assintant = numberRandom[i];
                numberRandom[i] = numberRandom[j];
                numberRandom[j] = assintant;
            }
        }

        numberRandom[left] = numberRandom[j];
        numberRandom[j] = pivot;

        if(left < j-1){
            sortByQuick(numberRandom, left, j-1);
        }
        if(j+1 < rigth){
            sortByQuick(numberRandom, j+1, rigth);
        }

        for (int k = 0; k < numberRandom.length ; k++) {
            System.out.println("QuickSort: " + numberRandom[k]);
        }
        System.out.println(" ");
    }

}
