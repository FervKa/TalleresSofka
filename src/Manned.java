/**
 * Se refiere a la nave de clase Tripulada.
 */
public class Manned extends Ship implements IPropellers{


    /**
     * Se instancia e inicializa la herencia que deja Ship, que son los datos de la nave.
     */
    public Manned(){
        this.type = "Tripulada";
        this.motorsNumber = 4;
        this.size = 1500;
        this.weight = 5900;
    }


    /**
     * Estas son funciones abstractas que la clase abstracta da, (Ship)
     */
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
     * @param force: Referencia a la fuerza con la que arrancan los propulsores.
     */
    @Override
    public void takeOff(int force) {
        System.out.println("The ship is taking off, with a force of: " + force);
    }

    /**
     * @param resistance: Se recibe como parámetro para saber la resistencia con la que el propulsor está desacelerando.
     */
    @Override
    public void decelerete(int resistance) {
        System.out.println("The ship is decelerating with a resistance of " + resistance + " gravitational");
    }


    /**
     * Se refiere a si la nave está siendo tripulada o no, recibe como parámetro un dato de tipo booleano.
     *
     * @param crew
     */
    public void manning(boolean crew){
        System.out.println("The ship is manning: " + crew);
    }

    /**
     * Ángulo de inclinación en el que la nave será lanzada, viene en grados  °  .
     *
     * @param angle: el ángulo.
     */
    public void angleOfInclination(int angle){
        System.out.println("The angle of inclination is: " + angle );
    }

    /**
     * Imprime los datos que se crean por herencia y se estipulan.
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
