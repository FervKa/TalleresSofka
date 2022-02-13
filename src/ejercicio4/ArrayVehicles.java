package ejercicio4;

import java.util.Scanner;

public class ArrayVehicles extends Vehicle {


    public ArrayVehicles(int numeroPasajeros) {
        super(numeroPasajeros);
    }

    public static void crearVehiculos() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el dato");
        int numeroPasajeros = sc.nextInt();





        Vehicle vehicle = new Vehicle(numeroPasajeros);
        Vehicle.listVehicles.add(vehicle);
        for (int i = 0; i < Vehicle.listVehicles.toArray().length ; i++) {
            System.out.println(Vehicle.listVehicles);
        }





       /* Scanner response = new Scanner(System.in);

        System.out.println("Ingresar numero de pasajeros: ");
        vehicle.setNumeroDePasajeros(response.nextInt());
       System.out.println("Â¿Hay tripulacion? [Y/N]: ");
       if (response.hasNext() == false){
       vehicle.setHayTripulacion(false);
   }
        System.out.println("Ingresar numero de ruedas: ");
        vehicle.setNumeroRuedas(response.nextInt());
        System.out.println("Ingresar fecha de matricula: ");
        vehicle.setFechaMatriclua(response.next());
        System.out.println("Ingresar medio de desplazamiento");
        vehicle.setMedioDeDesplazamiento(response.next());
        System.out.println(" ");

        */
    }

    public static void crearListaVehiculos() {
        /*for (int i = 0; i < vehicles.length-1; i++) {
            vehicles[i] = vehicle;
            System.out.println(vehicles[i].toString());
        }

         */

    }

}
