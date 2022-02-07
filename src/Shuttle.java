/**
 * Se refiere a una nave de tipo Lanzadera.
 */
public class Shuttle extends Ship implements IPropellers{


    /**
     * Se instancia y se inicializan los datos heredados.
     */
    public Shuttle(){
        this.type = "Lanzadera";
        this.motorsNumber = 3;
        this.size = 1430;
        this.weight = 2300;

    }

    /**
     * Estas son funciones abstractas que la clase abstracta da, (Ship)
     */
    @Override
    public void closeDoors() {
        System.out.println("I'm closing the doors.");
    }

    @Override
    public void adjustTrajectory() {
        System.out.println("I'm adjusting the trajectory.");
    }

    @Override
    public void cleanPropells(boolean clean) {
        System.out.println("Cleaning Propells: " + clean);
    }
    /**
     * Finalizan las funciones abstractas.
     */


    /**
     *
     * @param time: Referencia a tiempo en segundos.
     */
    @Override
    public void timeIgnite(int time) {
        System.out.println("The time to Ignite is: " + time);
    }

    /**
     *
     * @param force: Referencia a la fuerza con la que arrancan los propulsores.
     */
    @Override
    public void takeOff(int force) {

        System.out.println("The ship is taking off, with a force of: " + force);
    }

    /**
     *
     * @param resistance: Se recibe como parámetro para saber la resistencia con la que el propulsor está desacelerando.
     */
    @Override
    public void decelerete(int resistance) {
        System.out.println("The ship is decelerating with a resistance of " + resistance + " gravitational");
    }



    /**
     * Hace referencia de si la nave está en vuelo o no.
     *
     * @param fly: volando
     */
    public void fly(boolean fly){
        System.out.println("The ship is flying: " + fly);
    }

    /**
     * Revisa los controles de la nave.
     */
    public void reviewControls(){
        System.out.println("Review controls on");
    }

    /**
     * Imprime los datos que se crean por herencia y se estipulan.
     */
    public void printShip(){
        System.out.println("\nLa nave de Tipo No Tripulada fue creada con los siguientes parámetro prestablecidos:\n");
        takeOff(2);
        decelerete(3);
        cleanPropells(true);
        fly(true);
        reviewControls();
        timeIgnite(150);
        System.out.println(
                "Tipo de Nave: " + this.type+"\n" +
                        "Número de motores: " + this.motorsNumber + "\n" +
                        "Tamaño de la Nave en m: " + this.size + "\n" +
                        "Peso de la nave en Kg: " + this.weight + "\n\n" +
                        "______________________________________________");
    }
}
