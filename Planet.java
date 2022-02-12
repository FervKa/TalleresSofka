public class Planet {

    /**
     * La masa equivale a x10^24 kg
     */
    private int id;
    private String name;
    private double mass;
    private double density;
    private double diameter;
    private double distanceToTheSun;





    public Planet(int id, double mass, double density, double diameter, double distanceToTheSun, String name) {
        this.id = id;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceToTheSun = distanceToTheSun;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceToTheSun() {
        return distanceToTheSun;
    }

    public void setDistanceToTheSun(double distanceToTheSun) {
        this.distanceToTheSun = distanceToTheSun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
