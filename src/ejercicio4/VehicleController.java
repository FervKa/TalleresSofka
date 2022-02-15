package ejercicio4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class VehicleController extends Vehicle {

    public static ArrayList<Vehicle> listVehicles = new ArrayList<>();

    public VehicleController() {
    }

    public static void createVehicles() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (listVehicles.toArray().length < 10) {

            Scanner sc = new Scanner(System.in);
            System.out.print("\nIngrese numero de pasajeros: ");
            int numberPassengers = sc.nextInt();
            System.out.print("Hay tripulacion: ");
            String hasCrew = sc.next();
            System.out.print("Ingrese el numero de ruedas: ");
            int numberWheels = sc.nextInt();
            System.out.print("Ingrese la fecha de matricula [dd/MM/yyyy]: ");
            String dateEnrollment = sc.next();
            System.out.print("Ingrese el medio de desplazamiento: ");
            String mediumWhereUsed = sc.next();

            Vehicle vehicle = new Vehicle(numberPassengers, hasCrew, numberWheels, dateEnrollment, mediumWhereUsed);
            listVehicles.add(vehicle);
            for (int i = 0; i < listVehicles.toArray().length ; i++) {
                System.out.print(listVehicles.get(i));
                System.out.println(" ");
            }
        }
    }
}
