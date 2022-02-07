/**
 * The type Turism.
 */
public class Turism extends Ship implements IPropellers {

    /**
     * The Number of persons.
     */
    public int numberOfPersons;
    /**
     * The Cost of seating.
     */
    public float costOfSeating;


    /**
     * Gets number of persons.
     *
     * @return the number of persons
     */
    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    /**
     * Sets number of persons.
     *
     * @param numberOfPersons the number of persons
     */
    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    /**
     * Gets cost of seating.
     *
     * @return the cost of seating
     */
    public float getCostOfSeating() {
        return costOfSeating;
    }

    /**
     * Sets cost of seating.
     *
     * @param costOfSeating the cost of seating
     */
    public void setCostOfSeating(float costOfSeating) {
        this.costOfSeating = costOfSeating;
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



    //---------------------------------------------
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
     * Count.
     *
     * @param numberOfPersons the number of persons
     */
    public void count(int numberOfPersons){
        System.out.println("The number of people is: " + numberOfPersons);
    }

    /**
     * Cost seating.
     *
     * @param cost the cost
     */
    public void costSeating(float cost){
        System.out.println("The cost of seating is: " + cost);
    }

    /**
     * Print ship.
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
