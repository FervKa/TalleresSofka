public class Unmanned extends Ship implements IPropellers{

    public int time;
    private int force;
    private int resistance;


    public Unmanned(){
        this.type = "No tripulada";
        this.motorsNumber = 4;
        this.size = 1203;
        this.weight = 3100;
    }

    @Override
    public void closeDoors() {
        System.out.println("The Doors are open. ¡Be careful!");
    }

    @Override
    public void adjustTrajectory() {
        System.out.println("The trajectory is not set.");
    }

    @Override
    public void cleanPropells(boolean clean) {
        System.out.println("Cleaning Propells: " + clean);
    }


    //----------------------------------------
    @Override
    public void timeIgnite(int time) {
        this.time = time;
        System.out.println("The time to Ignite is: " + this.time);
    }

    @Override
    public void takeOff(int force) {
        this.force = force;
        System.out.println("The ship is taking off, with a force of: " + this.force);
    }

    @Override
    public void decelerete(int resistance) {
        this.resistance = resistance;
        System.out.println("The ship is decelerating with a resistance of " + this.resistance + " gravitational");
    }

    //*****************************************

    public void shipOn(boolean shipOn){
        if(shipOn == true){
            System.out.println("The ship is On.");
        }else{
            System.out.println("The ship is Off.");
        }
    }

    public void windowsClean(){
        System.out.println("The windows are clean.");
    }

    public void printShip(){
        System.out.println("\nLa nave de Tipo No Tripulada fue creada con los siguientes parámetro prestablecidos:\n");
        takeOff(4);
        decelerete(0);
        cleanPropells(false);
        shipOn(false);
        windowsClean();
        timeIgnite(100);
        System.out.println(
                "Tipo de Nave: " + this.type+"\n" +
                "Número de motores: " + this.motorsNumber + "\n" +
                "Tamaño de la Nave en m: " + this.size + "\n" +
                "Peso de la nave en Kg: " + this.weight + "\n\n" +
                "______________________________________________");

    }


}
