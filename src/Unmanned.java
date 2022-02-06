public class Unmanned extends Ship{

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
    public void cleanPropells() {
        System.out.println("The Doors are open. ¡Be careful!");
    }

    public void shipOn( ){
        System.out.println("The ship is On.");
    }

    public void windowsClean(){
        System.out.println("The windows are clean.");
    }

}
