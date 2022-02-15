package ejercicio5;

import ejercicio4.Vehicle;

public class MotorCycle extends Vehicle {

    private String motorType;


    public MotorCycle(int numberPassengers, String hasCrew, int numberWheels, String dateEnrollment, String mediumWhereUsed, String motorType) {
        super(numberPassengers, hasCrew, numberWheels, dateEnrollment, mediumWhereUsed);
        this.motorType = motorType;
    }


    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }
}
