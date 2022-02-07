/**
 * The type Manned.
 */
public class Manned extends Ship implements IPropellers{


    public Manned(){
        this.type = "Tripulada";
        this.motorsNumber = 4;
        this.size = 1500;
        this.weight = 5900;
    }


    @Override
    public void closeDoors() {
        System.out.println("The doors are close.");
    }

    @Override
    public void adjustTrajectory() {
        System.out.println("The trajectory is adjusted.");
    }

    @Override
    public void cleanPropells(boolean clean) {
        System.out.println("Cleaning Propells: " + clean);
    }




    @Override
    public void timeIgnite(int time) {
        System.out.println("The time to Ignite is: " + time);
    }

    @Override
    public void takeOff(int force) {
        System.out.println("The ship is taking off, with a force of: " + force);
    }

    @Override
    public void decelerete(int resistance) {
        System.out.println("The ship is decelerating with a resistance of " + resistance + " gravitational");
    }


    /**
     * Manning.
     *
     * @param crew the crew
     */
    public void manning(boolean crew){
        System.out.println("The ship is manning: " + crew);
    }

    /**
     * Angle of inclination.
     *
     * @param angle the angle
     */
    public void angleOfInclination(int angle){
        System.out.println("The angle of inclination is: " + angle );
    }

    /**
     * Print ship.
     */
    public void printShip(){
        System.out.println("\nLa nave de Tipo No Tripulada fue creada con los siguientes parámetro prestablecidos:\n");
        takeOff(2);
        decelerete(3);
        cleanPropells(true);
        angleOfInclination(87);
        manning(true);
        timeIgnite(150);
        System.out.println(
                "Tipo de Nave: " + this.type+"\n" +
                        "Número de motores: " + this.motorsNumber + "\n" +
                        "Tamaño de la Nave en m: " + this.size + "\n" +
                        "Peso de la nave en Kg: " + this.weight + "\n\n" +
                        "______________________________________________");
    }
}
