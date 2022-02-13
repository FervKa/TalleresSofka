package ejercicio4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Vehicle {

    public static ArrayList<Vehicle> listVehicles = new ArrayList<>();
    private int numeroDePasajeros;
    private boolean hayTripulacion = false;
    private int numeroRuedas;
    private String fechaMatriclua;
    private String medioDeDesplazamiento;

    public Vehicle(int numeroPasajeros) {
        this.numeroDePasajeros = numeroPasajeros;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "numeroDePasajeros=" + numeroDePasajeros +
                ", hayTripulacion=" + hayTripulacion +
                ", numeroRuedas=" + numeroRuedas +
                ", fechaMatriclua='" + fechaMatriclua + '\'' +
                ", medioDeDesplazamiento='" + medioDeDesplazamiento + '\'' +
                '}';
    }

    public ArrayList<Vehicle> getListVehicles() {
        return listVehicles;
    }

    public void setListVehicles(ArrayList<Vehicle> listVehicles) {
        this.listVehicles = listVehicles;
    }

    public int getNumeroDePasajeros() {
        return numeroDePasajeros;
    }

    public void setNumeroDePasajeros(int numeroDePasajeros) {
        this.numeroDePasajeros = numeroDePasajeros;
    }

    public boolean isHayTripulacion() {
        return hayTripulacion;
    }

    public void setHayTripulacion(boolean hayTripulacion) {
        this.hayTripulacion = hayTripulacion;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getFechaMatriclua() {
        return fechaMatriclua;
    }

    public void setFechaMatriclua(String fechaMatriclua) {
        this.fechaMatriclua = fechaMatriclua;
    }

    public String getMedioDeDesplazamiento() {
        return medioDeDesplazamiento;
    }

    public void setMedioDeDesplazamiento(String medioDeDesplazamiento) {
        this.medioDeDesplazamiento = medioDeDesplazamiento;
    }
}