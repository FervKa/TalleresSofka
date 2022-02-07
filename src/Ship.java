/**
 * Clase abstracta Ship, haciendo referencia a un molde de naves con características similares.
 */
public abstract class Ship{

    /**
     * El tipo de nave, (Manned, Unmanned, Shuttle, Turism)
     */
    public String type;
    /**
     * Hace referencia al número de motores que posee la nave.
     */
    public int motorsNumber;
    /**
     * Se refiere al tamaño de la nave en cuestión, esta va en cm.
     */
    public float size;
    /**
     * Peso de la nave en Kg.
     */
    public float weight;


    /**
     * Retorna el valor guardado en Type.
     *
     * @return : tipo.
     */
    public String getType() {
        return type;
    }

    /**
     * Establece el valor en la variable.
     *
     * @param type : El tipo.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Retorna el valor guardado en motorsNumber.
     *
     * @return : el número de motores.
     */
    public int getMotorsNumber() {
        return motorsNumber;
    }

    /**
     * Establece el valor en la variable motorsNumber.
     *
     * @param motorsNumber : número de motores.
     */
    public void setMotorsNumber(int motorsNumber) {
        this.motorsNumber = motorsNumber;
    }

    /**
     * Retorna el valor guardado en size.
     *
     * @return el tamaño.
     */
    public float getSize() {
        return size;
    }

    /**
     * Establece el valor en la variable size.
     *
     * @param size el tamaño.
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * Retorna el valor guardado en weight.
     *
     * @return el peso.
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Establece el valor en la variable weight.
     *
     * @param weight : El peso.
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }


    /**
     * Función abstracta cerrar puertas.
     */
    public abstract void closeDoors();

    /**
     * Función abstracta ajustar trayectoría.
     */
    public abstract void adjustTrajectory();

    /**
     * Función abstracta limpiar propulsores.
     * Recibe como parámetro un dato booleano, para saber si sí (true) se limpian los propulsores o no (false)
     *
     * @param clean the clean
     */
    public abstract void cleanPropells(boolean clean);

}