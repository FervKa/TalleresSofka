public class PlanetarySystem implements IGravitational{

    public final double cavendishConstant = 0.0000000000667;


    @Override
    public void calculatingGravitationalAttraction(double planetMass1, double planetMass2, double distanceOfPlanets,
                                                   String planetName1, String planetName2) {
        double gravitationalAttraction = (cavendishConstant * planetMass1 * planetMass2) / Math.pow(distanceOfPlanets, 2);
        System.out.println("La fuerza de atracción entre " + planetName1 + " Y " + planetName2 + " es: " + gravitationalAttraction + " N " );
    }
}
