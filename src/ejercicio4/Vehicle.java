package ejercicio4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Vehicle {

    public static ArrayList<Vehicle> listVehicles = new ArrayList<>();
    private int numberPassengers;
    private String hasCrew;
    private int numberWheels;
    private String dateEnrollment;
    private String mediumWhereUsed;


    public Vehicle(int numberPassengers, String hasCrew, int numberWheels, String dateEnrollment, String mediumWhereUsed) {
        this.numberPassengers = numberPassengers;
        this.hasCrew = hasCrew;
        this.numberWheels = numberWheels;
        this.dateEnrollment = dateEnrollment;
        this.mediumWhereUsed = mediumWhereUsed;
    }

    public Vehicle() {
    }

    public Vehicle(int numeroPasajeros) {
        this.numberPassengers = numeroPasajeros;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "numberPassengers=" + numberPassengers +
                ", hasCrew=" + hasCrew +
                ", numberWheels=" + numberWheels +
                ", dateEnrollment='" + dateEnrollment + '\'' +
                ", mediumWhereUsed='" + mediumWhereUsed + '\'' +
                '}';
    }

    public ArrayList<Vehicle> getListVehicles() {
        return listVehicles;
    }

    public void setListVehicles(ArrayList<Vehicle> listVehicles) {
        this.listVehicles = listVehicles;
    }

    public int getnumberPassengers() {
        return numberPassengers;
    }

    public void setnumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public String ishasCrew() {
        return hasCrew;
    }

    public void sethasCrew(String hasCrew) {
        this.hasCrew = hasCrew;
    }


    public int getnumberWheels() {
        return numberWheels;
    }

    public void setnumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public String getdateEnrollment() {
        return dateEnrollment;
    }

    public void setdateEnrollment(String dateEnrollment) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Date dateEnrollmentParsed = format.parse(dateEnrollment);
        String dateEnrollmentString = dateEnrollmentParsed.toString();

        this.dateEnrollment = dateEnrollmentString;
    }

    public String getmediumWhereUsed() {
        return mediumWhereUsed;
    }

    public void setmediumWhereUsed(String mediumWhereUsed) {
        this.mediumWhereUsed = mediumWhereUsed;
    }
}