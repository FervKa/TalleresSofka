/**
 * Esta clase está creada para la abstracción de las características de una fruta.
 *
 *
 * @author Stiven Suárez Marín.
 *
 */


/**
 * Acá inicia la clase Fruit, que hace alusión a una fruta, con sus características básicas.
 */

public class Fruit {

    /**
     * Esta variable se refiere al nombre de la fruta, ejm:
     * - Pera.
     * - Papaya.
     * - Etc.
     */
    public String name;

    /**
     * Esta variable hace referencia al peso promedio de la fruta que se habla en cuestión.
     */
    private float averageWeight;


    /**
     * Este atributo son los posibles colores que puede tomar la fruta.
     */
    public String[] colors;


    /**
     * Método constructor.
     */

    /**
     * Este método, es el encargado de ayudar al crear el objeto de clase Fruit, recibe tres (3) parámetros que son:
     * @param name
     * @param averageWeight
     * @param colors
     */


    public Fruit(String name, float averageWeight, String[] colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }


    /**
     * Getters y Setters
     */

    /**
     * Se encarga de retornar el nombre almacenado en la variable name, el cual se entrega al crear el objeto.
     * @return
     */

    public String getName() {
        return name;
    }

    /**
     * @param name: Recibe como argumento un String, el cual lo almacena para su próxima utilización a medida que avanza el programa.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Retorna el valor guardado que se encuentra en la variable que se ingreso al momento de crear el objeto en el constructor.
     * @return
     */
    public float getAverageWeight() {
        return averageWeight;
    }


    /**
     * @param averageWeight: Esto traduce a peso medio. Es recibido como parámetro para la creación del objeto.
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }


    /**
     * Retorna un Array de posibles colores que podría obtener una fruta.
     * @return
     */
    public String[] getColors() {
        return colors;
    }


    /**
     * Del Array ingresado en el Constructor, establece los datos en la variable destinada.
     * Recibe como parámetro un Array.
     * @param colors
     */
    public void setColors(String[] colors) {
        this.colors = colors;
    }
}
