package ejercicio5;

import ejercicio4.Vehicle;

public class Car extends Vehicle {


    private String numberOfAxis;


    public Car(int numberPassengers, String hasCrew, int numberWheels, String dateEnrollment, String mediumWhereUsed, String numberOfAxis) {
        super(numberPassengers, hasCrew, numberWheels, dateEnrollment, mediumWhereUsed);
        this.numberOfAxis = numberOfAxis;
    }

    public String getNumberOfAxis() {
        return numberOfAxis;
    }

    public void setNumberOfAxis(String numberOfAxis) {
        this.numberOfAxis = numberOfAxis;
    }

}
