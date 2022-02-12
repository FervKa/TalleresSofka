public class Main {
    public static void main(String[] args) {

        Planet earth = new Planet(1, 5.972, 5.51, 12.742, 149.7, "earth");
        Planet jupiter = new Planet(2, 1.898, 1.33, 139.822, 778.5, "jupiter");


        PlanetarySystem planetarySystem = new PlanetarySystem();

        planetarySystem.calculatingGravitationalAttraction(earth.getMass(), jupiter.getMass(), 660, earth.getName(), jupiter.getName());


    }
}
