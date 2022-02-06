public class Shuttle extends Ship implements IPropellers{

    public int time;
    private int force;
    private int resistance;

    public Shuttle(){
        this.type = "Lanzadera";
        this.motorsNumber = 3;
        this.size = 1430;
        this.weight = 2300;

    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    @Override
    public void closeDoors() {
        System.out.println("I'm closing the doors.");
    }

    @Override
    public void adjustTrajectory() {
        System.out.println("I'm adjusting the trajectory.");
    }

    @Override
    public void cleanPropells() {
        System.out.println("I'm cleaning propells.");
    }


    @Override
    public void timeIgnite(int time) {
        this.time = 150;
    }

    @Override
    public void takeOff(int force) {
        this.force = 2;
    }

    @Override
    public void decelerete(int resistance) {
        this.resistance = 45;
    }




    public void fly(){
        System.out.println("I'm Flying");
    }

    public void reviewControls(){
        System.out.println("Review controls on");
    }

    public void printShip(){
        System.out.println("\nLa nave de Tipo Lazandera fue creada con los siguientes parámetro prestablecidos:\n" +
                "Tipo de Nave: " + this.type+"\n" +
                "Número de motores: " + this.motorsNumber + "\n" +
                "Tamaño de la Nave en m: " + this.size + "\n" +
                "Peso de la nave en Kg: " + this.weight + "\n\n" +
                "______________________________________________");
    }
}
