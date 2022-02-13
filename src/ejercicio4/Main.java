package ejercicio4;

import com.sun.jdi.ArrayReference;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int response = 0;

        do {
            System.out.println("Ingesa algo:");
            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();
            ArrayVehicles.crearVehiculos();

            switch (response){
                case 0:
                    break;
            }
        } while (response != 0);


    }
}
