/**
 * Esta clase abstrae aspectos que todas las personas tienen y las convierte en código.
 * @author Stiven Suárez Marín.
 */

/**
 * Estas son las importaciones correspondientes para el correcto funcionamiento de la clase.
 */

/**
 * Esta importación se utiliza para atrapar los errores al hacer un Parseo.
 */
import java.text.ParseException;

/**
 * Esta importación se utiliza para darle un formato específico a una fecha deseada.
 */
import java.text.SimpleDateFormat;

/**
 * Esta importación se utiliza para traer información de tipo fecha.
 */
import java.util.Date;


/**
 * Comienza la clase Person, que se refiere a atributos de una persona, tales como:
 * - Nombre.
 * - Apellidos.
 * - Fecha de cumpleanios.
 * - Altura de la persona.
 */

public class Person {

    /**
     * Esta variable representa el nombre registrado en la identificación de la persona.
     */
    public String name;


    /**
     * Estas variables representa el primer y segundo apellido registrado en la identificación de la persona.
     */
    public String lastName1;
    public String lastName2;


    /**
     * Esta variable representa en tipo Date, la fecha de cumpleaños registrada en la identificación de la persona.
     */
    public String dateBirth;


    /**
     * Esta variable representa y almacena el dato de la altura de la persona en cuestión.
     */
    public float height;


    /**
     * Inician los Getters y Setters, con los que se hará uso de las variables en diferentes objetos.
     */


    /**
     * Devuelve el valor guardado en Name al crear la clase.
     *
     * @return
     */
    public String getName() {
        return name;
    }


    /**
     * @param name: Recibe como argumento Name, que refiere al nombre que se le da al momento de crear el objeto de
     *              tipo Person.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Tanto para lastName1 y lastName2, el Set, recibe el parámetro Apellido# para almacenarlo en la variable lastName#
     * para su posterior utilización.
     *
     *
     * Set:
     * ---------------------------------------------------
     *                       lastName1
     *
     * @param lastName1
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }


    /**
     * ---------------------------------------------------
     *                       lastName2
     *
     * @param lastName2
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }



    /**
     * Devuelve el dato almacenado en lastName1, que se refiere al primer y sgundo
     * apellido de la persona creada en el objeto.
     *
     * Get:
     * ---------------------------------
     *              getLastName1
     * @return
     */

    public String getLastName1() {
        return lastName1;
    }


    /**
     * Get:
     * ---------------------------------
     *              getLastName2
     * @return
     */

    public String getLastName2() {
        return lastName2;
    }


    /**
     * Retorna el valor guardado de la fecha ingresada por el usuario.
     *
     * @return
     */

    public String getDateBirth() {
        return dateBirth;
    }

    /**
     *
     * @param dateBirth: Recibe como parámetro la fecha que el usuario ingresa al momento de crear el objeto.
     * @throws ParseException: Es una sentencia para lanzar una excepción de manera explícita. Captura errores en caso de
     * fallas en el código.
     */

    public void setDateBirth(String dateBirth) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date dateBirth1 = format.parse(dateBirth);
        String dateBirthParse = dateBirth1.toString();
        this.dateBirth = dateBirthParse;
    }


    /**
     * Retorna el valor guardado en la variable height, que es asignada al momento de la creación del objeto Person.
     * @return
     */

    public float getHeight() {
        return height;
    }


    /**
     * Recibe como argumento height, que se refiere a la altua de la persona, se almacena para su posterior utilización
     * en el código.
     *
     *
     * @param height
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Finalizan los Getters y Setters.
     */
}