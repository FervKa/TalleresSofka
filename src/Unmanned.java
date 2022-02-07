/**
 * Tipo de nave No Tripulada.
 *
 * @autor Stiven Suárez Marín
 */
public class Unmanned extends Ship implements IPropellers{

    /**
     * Hace referencia al tiempo de despegue.
     */
    public int time;
    /**
     * Hace referencia a la fuerza que usa para despegar.
     */
    private int force;
    /**
     * Resistencia con la que cuenta la nave en gravedad para el despegue.
     */
    private int resistance;


    /**
     * Inicialización de la nave "No tripulada", con los atributos heredados de Ship.
     */
    public Unmanned(){
        this.type = "No tripulada";
        this.motorsNumber = 4;
        this.size = 1203;
        this.weight = 3100;
    }

    /**
     * Estas son funciones abstractas que la clase abstracta da, (Ship)
     */
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
    /**
     * Finalizan las funciones abstractas.
     */


    /**
     * @param time: Referencia a tiempo en segundos.
     */
    @Override
    public void timeIgnite(int time) {
        this.time = time;
        System.out.println("The time to Ignite is: " + this.time);
    }

    /**
     *
     * @param force: Referencia a la fuerza con la que arrancan los propulsores.
     */
    @Override
    public void takeOff(int force) {
        this.force = force;
        System.out.println("The ship is taking off, with a force of: " + this.force);
    }

    /**
     * @param resistance: Se recibe como parámetro para saber la resistencia con la que el propulsor está desacelerando.
     */
    @Override
    public void decelerete(int resistance) {
        this.resistance = resistance;
        System.out.println("The ship is decelerating with a resistance of " + this.resistance + " gravitational");
    }

    //*****************************************

    /**
     * Evalúa el parámetro ingresado y dependiendo de este, imprime si la nave está encendida o no.
     *
     * @param shipOn La nave encendida.
     */
    public void shipOn(boolean shipOn){
        if(shipOn == true){
            System.out.println("The ship is On.");
        }else{
            System.out.println("The ship is Off.");
        }
    }

    /**
     * Esta función limpia las ventanas.
     */
    public void windowsClean(){
        System.out.println("The windows are clean.");
    }

    /**
     * Imprime los datos con los que se crea el objeto.
     */
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
