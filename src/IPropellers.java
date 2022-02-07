/**
 * Interfaz IPropellers que hace referencia a los propulsores.
 */
public interface IPropellers {
    /**
     * Tiempo de ignición que demoran los propulsores en iniciar.
     *
     * @param time: Referencia a tiempo en segundos.
     */
    public void timeIgnite(int time);

    /**
     * Despegue, hace referencia a si el propulsor está despegando o no, recibe como parámetro la fuerza con la que lo hace.
     *
     * @param force: Referencia a la fuerza con la que arrancan los propulsores.
     */
    public void takeOff(int force);

    /**
     * Hace referencia a si el propulsor se encuentra desacelerando.
     *
     * @param resistance: Se recibe como parámetro para saber la resistencia con la que el propulsor está desacelerando.
     */
    public void decelerete(int resistance);
}
