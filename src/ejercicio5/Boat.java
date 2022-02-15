package ejercicio5;

import ejercicio4.Vehicle;

public class Boat extends Vehicle {

    private int numberOfBlades;


    public Boat(int numberPassengers, String hasCrew, int numberWheels, String dateEnrollment, String mediumWhereUsed, int numberOfBlades) {
        super(numberPassengers, hasCrew, numberWheels, dateEnrollment, mediumWhereUsed);
        this.numberOfBlades = numberOfBlades;
    }

    public int getNumberOfBlades() {
        return numberOfBlades;
    }

    public void setNumberOfBlades(int numberOfBlades) {
        this.numberOfBlades = numberOfBlades;
    }
}
