public class Shuttle extends Ship implements IPropellers{


    public Shuttle(){
        this.type = "Lanzadera";
        this.motorsNumber = 3;
        this.size = 1430;
        this.weight = 2300;

    }


    //----------------------------------------
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


    //----------------------------------------
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

    //----------------------------------------



    public void fly(boolean fly){
        System.out.println("The ship is flying: " + fly);
    }

    public void reviewControls(){
        System.out.println("Review controls on");
    }

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
