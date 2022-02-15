package ejercicio5;

import ejercicio4.Vehicle;

public class Bicycle extends Vehicle {

    private String typeCandle;


    public Bicycle(int numberPassengers, String hasCrew, int numberWheels, String dateEnrollment, String mediumWhereUsed, String typeCandle) {
        super(numberPassengers, hasCrew, numberWheels, dateEnrollment, mediumWhereUsed);
        this.typeCandle = typeCandle;
    }

    public String getTypeCandle() {
        return typeCandle;
    }

    public void setTypeCandle(String typeCandle) {
        this.typeCandle = typeCandle;
    }
}
