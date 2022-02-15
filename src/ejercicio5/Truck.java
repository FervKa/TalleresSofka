package ejercicio5;

import ejercicio4.Vehicle;

public class Truck extends Vehicle {

    private float supportedWeigth;


    public Truck(int numberPassengers, String hasCrew, int numberWheels, String dateEnrollment, String mediumWhereUsed, float supportedWeigth) {
        super(numberPassengers, hasCrew, numberWheels, dateEnrollment, mediumWhereUsed);
        this.supportedWeigth = supportedWeigth;
    }

    public float getSupportedWeigth() {
        return supportedWeigth;
    }

    public void setSupportedWeigth(float supportedWeigth) {
        this.supportedWeigth = supportedWeigth;
    }
}
