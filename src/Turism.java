/**
 * Hace referncia a la nave de tipo Turismo.
 *
 *
 * @autor Stiven Suárez Marín
 */
public class Turism extends Ship implements IPropellers {

    /**
     * Número de personas capaces de albergar la nave.
     */
    public int numberOfPersons;
    /**
     * Costo de los asientos en la nave.
     */
    public float costOfSeating;


    /**
     * Inicialización de la clase Turismo heredada de Ship.
     */
    public Turism(){
        this.type = "Turismo";
        this.motorsNumber = 6;
        this.size = 1500;
        this.weight = 4000;
    }


    /**
     * Getters y Setters de los atributos de esta nave.
     *
     * @return número de personas.
     */
    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    /**
     * Establece el número de personas en la variable numberOfPersons
     *
     * @param numberOfPersons número de personas.
     */
    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    /**
     * Retorna el valor guardado en el costo de los asientos.
     *
     * @return el costo de los asientos.
     */
    public float getCostOfSeating() {
        return costOfSeating;
    }

    /**
     * Establece el valor de los asientos en la variable costOfSeating
     *
     * @param costOfSeating
     */
    public void setCostOfSeating(float costOfSeating) {
        this.costOfSeating = costOfSeating;
    }


    /**
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
     * @param numberOfPersons número de personas capaces de albergar la nave.
     */
    public void count(int numberOfPersons){
        System.out.println("The number of people is: " + numberOfPersons);
    }

    /**
     * Costo de los asientos en la nave.
     *
     * @param cost: costo
     */
    public void costSeating(float cost){
        System.out.println("The cost of seating is: " + cost);
    }

    /**
     * Imprime los datos que se encuentran
     */
    public void printShip(){
        System.out.println("\nLa nave de Tipo No Tripulada fue creada con los siguientes parámetro prestablecidos:\n");
        takeOff(2);
        decelerete(3);
        cleanPropells(true);
        costSeating(15000);
        count(43);
        timeIgnite(150);
        System.out.println(
                "Tipo de Nave: " + this.type+"\n" +
                        "Número de motores: " + this.motorsNumber + "\n" +
                        "Tamaño de la Nave en m: " + this.size + "\n" +
                        "Peso de la nave en Kg: " + this.weight + "\n\n" +
                        "______________________________________________");
    }
}
